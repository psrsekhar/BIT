package edu.bit;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlSingleton {
	private static final String HOST_NAME = "jdbc:mysql://localhost:3306/icici";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Duck@!4#";

	private static Connection connection = null;

	private SqlSingleton() {
	}

	public static Connection getConnection() {
		try {
			//lock for thread
			synchronized (SqlSingleton.class) {
				if (connection == null) {
					connection = DriverManager.getConnection(HOST_NAME, USER_NAME, PASSWORD);
				}				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
