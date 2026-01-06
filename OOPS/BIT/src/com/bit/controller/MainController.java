package com.bit.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bit.model.Language;

public class MainController {
	public static void main(String[] args) {
		Language language = null;
		Connection connection = null;
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ifi", "root", "Duck@!4#");
			String sql = "select id, name from ifi.language where id = 3";
			Statement statement = connection.createStatement();
			ResultSet response = statement.executeQuery(sql);
			while (response.next()) {
				language = new Language(response.getInt("id"), response.getString("name"));
			}
		} catch (SQLException ex) {
			System.err.println(ex.getMessage());
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException ex) {
				System.err.println(ex.getMessage());
			}
		}
	}

	private void display() {
		Language language = null;
		// try with resources
		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ifi", "root",
				"Duck@!4#")) {
			String sql = "select id, name from ifi.language where id = 3";
			Statement statement = connection.createStatement();
			ResultSet response = statement.executeQuery(sql);
			while (response.next()) {
				language = new Language(response.getInt("id"), response.getString("name"));
			}
		} catch (SQLException ex) {
			System.err.println(ex);
		}
	}
}

/**
 * LanguageService languageService = new LanguageServiceImpl(); Language
 * language = languageService.getLanguageById(3); System.out.println("ID:" +
 * language.getId() + "\tName:" + language.getName());
 * 
 * List<Language> languageList = languageService.getAllLanguages(); for(Language
 * language: languageList) { System.out.println("ID: " + language.getId() +
 * "\tName: " + language.getName()); }
 * 
 * // Parent Reference and child class object : Partial Abstraction
 * PaymentService paymentServiceImpl = new PaymentServiceImpl();
 * paymentServiceImpl.savePaymentDetails(new Payment(6546451, 456.23f,
 * "2026-01-05", "sam@143.com"));
 */
