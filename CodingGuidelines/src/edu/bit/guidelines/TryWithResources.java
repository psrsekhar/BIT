package edu.bit.guidelines;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;

public class TryWithResources {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in);
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bit", "root",
						"Duck@!4#");){
			Integer number = scanner.nextInt();
			System.out.println(number);	
		}catch(Exception ex) {
			System.err.println(ex.getMessage());
		}
	}
}