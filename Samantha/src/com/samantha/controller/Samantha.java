package com.samantha.controller;

import com.samantha.ui.BeforeLogin;

public class Samantha {

	public static void main(String[] args) {
		BeforeLogin beforeLogin = new BeforeLogin();
		beforeLogin.showWelcomeMessage();
	}
}
/**

FollowerService followerService = new FollowererviceImpl();
followerService.add(new Follower(1, 1));

PostService postService = new PostServiceImpl();
//System.out.println(postService.add(new Post(1, "I miss you!", null)));
List<Post> postList = postService.viewPosts(1);
for(Post post: postList) {
	System.out.println("User: " + post.getUserId() + "\tMessage: " + post.getMessage());
}

//UserService userService = new UserServiceImpl();
//System.out.println(userService.authenticate(new UserAccount(null, "sam", 0143)).getUserId());
//userService.add(new User(null, "Samantha", "sam@143.com", null, new UserAccount(null, "sam", 1430)));
*/