package com.samantha.ui;

import java.util.Scanner;

import com.samantha.dao.UserServiceImpl;
import com.samantha.model.User;
import com.samantha.model.UserAccount;
import com.samantha.service.UserService;

public class BeforeLogin {
	private Integer choice;
	private UserAccount userAccount;
	private UserService userService = new UserServiceImpl();
	private Scanner scanner = new Scanner(System.in);

	public void showWelcomeMessage() {
		System.out.println("Welcome to Samantha!");
		showMenu();
	}

	private void showMenu() {
		System.out.println("1.Sign up\n2.Login\n3.Exit");
		readChoice();
	}

	private void readChoice() {
		System.out.println("enter your choice:");
		this.choice = scanner.nextInt();
		operations();
	}

	private void operations() {
		switch (this.choice) {
		case 1:
			showSignup();
			showMenu();
			break;
		case 2:
			showLogin();
			showMenu();
			break;
		case 3:
			System.out.println("See you again!");
			System.exit(0);
		}
	}

	private void showLogin() {
		System.out.print("enter user name & PIN: ");
		userAccount = userService.authenticate(new UserAccount(null, scanner.next(), scanner.nextInt()));
		if (userAccount != null) {
			// login successful....
			System.out.println("Authenticated....");
			UserStatus.isLoggedIn = true;
			UserStatus.userId = userAccount.getUserId();
			AfterLogin afterLogin = new AfterLogin();
			afterLogin.showWelcomeMessage();
		} else {
			System.err.println("Invalid username/PIN.\nTry again later.");
		}
	}

	private void showSignup() {
		System.out.print("enter name, email, username & PIN: ");
		if (userService.add(new User(null, scanner.next(), scanner.next(), null,
				new UserAccount(null, scanner.next(), scanner.nextInt())))) {
			System.out.println("Congartulations!\nYour account created....");
		} else {
			System.err.println("Account creation failed.\nTry again later.");

		}
	}
}
