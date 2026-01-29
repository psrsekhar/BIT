package edu.bit.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class CommentServiceImpl implements CommentService {

	@Override
	public List<Comment> getCommentByPostId(Integer postId) {
		List<Comment> comments = new LinkedList<Comment>();
		try {
			//Authentication
			Connection connection = MySqlManager.getConnection();
			System.out.println("Connection: " + connection);
			//Statement creation
			Statement statement = connection.createStatement();
			String sql = "select post_id, user_name, comment from instagram.post_comments where post_id = " + postId;
			//Executing query
			 ResultSet response = statement.executeQuery(sql);
			 while(response.next()) {
				 comments.add(new Comment(response.getInt("post_id"), response.getString("user_name"), response.getString("comment")));
			 }
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}		
		return comments;
	}

}
