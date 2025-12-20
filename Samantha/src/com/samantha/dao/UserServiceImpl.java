package com.samantha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.samantha.model.User;
import com.samantha.model.UserAccount;
import com.samantha.service.UserService;

public class UserServiceImpl implements UserService {
	private String sql = null;

	@Override
	public boolean add(User user) {
		try {
			Connection connection = SqlManager.getConnection();
			sql = "insert into samantha.users (name, email) values (?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, user.getName());
			preparedStatement.setString(2, user.getEmail());
			if(preparedStatement.executeUpdate() > 0) {
				ResultSet resultSet = preparedStatement.getGeneratedKeys();
				if(resultSet.next()) {
					user.setId(resultSet.getInt(1));
					sql = "insert into samantha.user_accounts (user_name, user_id, pin) values (?, ?, ?)";
					preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setString(1, user.getUserAccount().getUserName());
					preparedStatement.setInt(2, user.getId());
					preparedStatement.setInt(3, user.getUserAccount().getPin());
					
					if(preparedStatement.executeUpdate() > 0) {
						return true;
					}					
				}
			}
		} catch (SQLException ex) {
			System.err.println("Exception raised during connection : " + ex.getMessage());
		}
		return false;
	}
	
	@Override
	public UserAccount authenticate(UserAccount userAccount) {
		try {
			Connection connection = SqlManager.getConnection();
			sql = "select user_id from samantha.user_accounts where user_name = '" + userAccount.getUserName()
					+ "' AND pin = " + userAccount.getPin();
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				userAccount.setUserId(resultSet.getInt("user_id"));
				userAccount.setPin(null);
				return userAccount;
			}
		} catch (SQLException ex) {
			System.err.println("Exception raised during connection : " + ex.getMessage());
		}

		return null;
	}

}
