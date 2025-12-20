package com.samantha.ui;

import java.util.List;
import java.util.Scanner;

import com.samantha.dao.PostServiceImpl;
import com.samantha.model.Post;
import com.samantha.service.PostService;

public class AfterLogin {
	private Integer choice;
	private Scanner scanner = new Scanner(System.in);
	private PostService postService = new PostServiceImpl();
	
	public void showWelcomeMessage() {
		System.out.println("Welcome! " + UserStatus.userId);
		showMenu();
	}

	public void showMenu() {
		System.out.println("1.Add a Post\n2.My Posts\n4.All Posts\n5.Follow\n6.Logout\n7.Exit");
		readChoice();
	}

	public void readChoice() {
		System.out.println("enter your choice:");
		this.choice = scanner.nextInt();
		operations();
	}

	public void operations() {
		switch (this.choice) {
		case 4:
			getAllPosts();
			showMenu();
			break;
		case 6:
			UserStatus.isLoggedIn = false;
			UserStatus.userId = null;
			System.out.println("Logged out!");
			BeforeLogin beforeLogin = new BeforeLogin();
			beforeLogin.showWelcomeMessage();
			break;			
		case 7:
			System.out.println("See you again!");
			System.exit(0);
		}
	}

	private void getAllPosts() {
		List<Post> postList = postService.viewAllPosts(UserStatus.userId);
		for(Post post: postList) {
			System.out.println("User: " + post.getUserId() + "\tMessage: " + post.getMessage());
		}
	}
}
