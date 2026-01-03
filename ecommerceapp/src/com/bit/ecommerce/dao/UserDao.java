package com.bit.ecommerce.dao;

import java.util.List;

import com.bit.ecommerce.domain.User;

public interface UserDao {
	
	public void login(User user);
	
	public void save(User user);
	
	public User get(int userId);
	
	public List<User> getAll();
}
