package edu.bit.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class PostServiceImpl implements PostService {

	@Override
	public List<Post> getAllPosts() {
		List<Post> postList = new LinkedList<Post>();
		
		try {
			//Authentication
			Connection connection = DriverManager.getConnection("jdbc://mysql:localhost:3306", "root", "Duck@!4#");
			//Statement creation
			Statement statement = connection.createStatement();
			String sql = "select id, user_name, post_type, message from instagram.posts";
			//Executing query
			 ResultSet response = statement.executeQuery(sql);
			 while(response.next()) {
				 postList.add(new Post(response.getInt("id"), response.getString("user_name"), response.getString("post_type"), null, response.getString("message")));
			 }
			 //closing the connection
			 connection.close();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		
		return postList;
	}

}
