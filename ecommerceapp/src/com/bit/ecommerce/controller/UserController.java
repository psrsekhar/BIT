package com.bit.ecommerce.controller;

import com.bit.ecommerce.domain.User;
import com.bit.ecommerce.service.UserService;
import com.bit.ecommerce.service.impl.UserServiceImpl;

public class UserController {
	UserService userService = new UserServiceImpl();
	public void register(String userDetails) {
		String[] parts = userDetails.split("\\|");
		User user = new User();
		user.setUsername(parts[0]);
		user.setPassword(parts[1]);
		user.setEmail(parts[2]);
		user.setMobile(parts[3]);
		userService.register(user);
	}
	
	public void login(User user) {
		userService.login(user);
	}
}
