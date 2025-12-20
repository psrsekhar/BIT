package com.samantha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.samantha.model.Follower;
import com.samantha.service.FollowerService;

public class FollowererviceImpl implements FollowerService {
	private String sql = null;
	
	@Override
	public boolean add(Follower follower) {
		Connection connection;
		try {
			connection = SqlManager.getConnection();
			sql = "insert into samantha.user_followers (user_id, follower_id) values (?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, follower.getUserId());
			preparedStatement.setInt(1, follower.getFollowerId());
			if (preparedStatement.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException ex) {
			System.err.println("Exception raised during connection : " + ex.getMessage());
		}
		return false;
	}

}
