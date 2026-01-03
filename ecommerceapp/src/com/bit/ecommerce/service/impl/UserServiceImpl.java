package com.bit.ecommerce.service.impl;

import com.bit.ecommerce.dao.UserDao;
import com.bit.ecommerce.dao.impl.UserDaoImpl;
import com.bit.ecommerce.domain.User;
import com.bit.ecommerce.service.UserService;

public class UserServiceImpl implements UserService {

	UserDao userDao = new UserDaoImpl();
	
	@Override
	public void register(User user) {
		userDao.save(user);
	}

	@Override
	public void login(User user) {
		userDao.login(user);
	}

}
