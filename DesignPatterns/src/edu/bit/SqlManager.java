package edu.bit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlManager {
	//static instance
	private static Connection connection;
	
	private static final String HOST = "jdbc:mysql://localhost:3306/bit";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Duck@!4#";
	
	//private constructor -> to restrict external object creation
	private SqlManager() {
	}
	
	//public method -> to create or return existing object
	public static Connection getConnection() throws SQLException {
		if(connection == null || connection.isClosed()) {
			try {
				connection = DriverManager.getConnection(HOST, USER_NAME, PASSWORD);
			} catch (SQLException e) {
				e.printStackTrace();
			};
		}
		return connection;
	}
}
//Saves memory, easy global access, ensures consistency, useful for shared resources