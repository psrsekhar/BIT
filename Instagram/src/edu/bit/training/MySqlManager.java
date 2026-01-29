package edu.bit.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlManager {
	// Singleton object
	private static Connection connection = null;

	// restricts object creation
	private MySqlManager() {
	}

	public static Connection getConnection() {
		try {
			if (connection == null) {
				connection = DriverManager.getConnection(Properties.HOST_NAME, Properties.USER_NAME,
						Properties.PASSWORD);
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
		return connection;
	}

	public static void closeConnection() {
		try {
			if (connection != null) {
				connection.close();
				connection = null;
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}
