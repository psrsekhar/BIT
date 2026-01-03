package com.bit.ecommerce.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.bit.ecommerce.dao.UserDao;
import com.bit.ecommerce.domain.User;
import com.bit.ecommerce.util.ConnectionPool;

public class UserDaoImpl implements UserDao {

	@Override
	public void login(User user) {
		ConnectionPool dataSource = ConnectionPool.getInstance();
		Connection connection = dataSource.getConnection();
		String query = "select * from users where username=? and password=?";
		
		try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2, user.getPassword());
			ResultSet resultSet = preparedStatement.executeQuery();
			boolean flag = resultSet.next();
			if (flag) {
				System.out.println("User logic success");
			} else {
				System.out.println("Invalid username or password");
			}
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		dataSource.releaseConnection(connection);
	}

	@Override
	public void save(User user) {
		
		ConnectionPool dataSource = ConnectionPool.getInstance();
		Connection connection = dataSource.getConnection();
		String query = "INSERT INTO Users (username, password, email, mobile) values (?, ?, ?, ?)";
		System.out.println(query);
		try (PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getEmail());
			statement.setString(4, user.getMobile());
			int count = statement.executeUpdate(query);
			System.out.println("Insert count : " + count);
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		dataSource.releaseConnection(connection);
	}

	@Override
	public User get(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
