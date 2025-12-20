package com.samantha.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.samantha.model.Post;
import com.samantha.service.PostService;

public class PostServiceImpl implements PostService {
	private String sql = null;

	@Override
	public boolean add(Post post) {
		Connection connection;
		try {
			connection = SqlManager.getConnection();
			sql = "insert into samantha.user_posts (user_id, message) values (?, ?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, post.getUserId());
			preparedStatement.setString(2, post.getMessage());
			if (preparedStatement.executeUpdate() > 0) {
				return true;
			}
		} catch (SQLException ex) {
			System.err.println("Exception raised during connection : " + ex.getMessage());
		}
		return false;
	}

	@Override
	public List<Post> viewPosts(Integer userId) {
		List<Post> postList = null;
		try {
			Connection connection = SqlManager.getConnection();
			sql = "select user_id, message, posted_on from samantha.user_posts where user_id = " + userId;
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			postList = new LinkedList<Post>();
			while (resultSet.next()) {
				postList.add(new Post(resultSet.getInt("user_id"), resultSet.getString("message"), null));				
			}
		} catch (SQLException ex) {
			System.err.println("Exception raised during connection : " + ex.getMessage());
		}
		return postList;
	}
	
	@Override
	public List<Post> viewAllPosts(Integer userId) {
		List<Post> postList = null;
		try {
			Connection connection = SqlManager.getConnection();
			sql = "select user_id, message from user_posts where user_id = "+userId+" OR user_id IN (select follower_id from user_followers where  user_id = "+userId+")";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			postList = new LinkedList<Post>();
			while (resultSet.next()) {
				postList.add(new Post(resultSet.getInt("user_id"), resultSet.getString("message"), null));				
			}
		} catch (SQLException ex) {
			System.err.println("Exception raised during connection : " + ex.getMessage());
		}
		return postList;
	}

}
