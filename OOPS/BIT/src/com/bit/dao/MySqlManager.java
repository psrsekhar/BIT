package com.bit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlManager {
	private static Connection connection = null;
	private static final String HOST_NAME = "jdbc:mysql://localhost:3306/ifi";
	private static final String USER_NAME = "root";
	private static final String PASSWORD = "Duck@!4#";

	private MySqlManager() {
		// private constructor to restrict object creation
	}

	public static Connection getMySqlConnection() {
		try {
			if(connection == null) {
				connection = DriverManager.getConnection(HOST_NAME, USER_NAME, PASSWORD);
			}
		} catch (SQLException e) {
			System.err.println("MySQL connection failed...");
		}
		return connection;
	}
}
