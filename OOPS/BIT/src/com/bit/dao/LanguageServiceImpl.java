package com.bit.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import com.bit.model.Language;
import com.bit.service.LanguageService;

public class LanguageServiceImpl implements LanguageService {
	@Override
	public List<Language> getAllLanguages() {
		List<Language> languageList = new LinkedList<Language>();
		try {
			// creating connection with MySQL
			Connection connection = MySqlManager.getMySqlConnection();

			// prepare sql query
			String sql = "select id, name from ifi.language";

			// prepare statement
			Statement statement = connection.createStatement();

			// execute query
			ResultSet response = statement.executeQuery(sql);
			
			while(response.next()) {
				Language language = new Language(response.getInt("id"), response.getString("name"));
				languageList.add(language);
			}

			// Closing the connection
			connection.close();
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		}
		return languageList;
	}

	@Override
	public Language getLanguageById(Integer id) {
		Language language = null;
		try {
			Connection connection = MySqlManager.getMySqlConnection();
			String sql = "select id, name from ifi.lang where id = " + id;
			Statement statement = connection.createStatement();
			ResultSet response = statement.executeQuery(sql);
			while(response.next()) {
				language = new Language(response.getInt("id"), response.getString("name"));
			}
			connection.close();
		}catch(SQLException ex) {
			System.err.println(ex.getMessage());
		}
		return language;
	}
}
