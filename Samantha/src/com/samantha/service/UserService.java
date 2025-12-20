package com.samantha.service;

import com.samantha.model.User;
import com.samantha.model.UserAccount;

public interface UserService {
	public boolean add(User user);
	public UserAccount authenticate(UserAccount userAccount);
}
