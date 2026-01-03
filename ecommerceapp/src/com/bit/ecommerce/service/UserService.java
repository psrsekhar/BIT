package com.bit.ecommerce.service;

import com.bit.ecommerce.domain.User;

public interface UserService {
	public void register(User user);
	
	public void login(User user);
}
