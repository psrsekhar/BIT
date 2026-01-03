package com.bit.ecommerce.service.impl;

import java.util.List;

import com.bit.ecommerce.dao.CartDao;
import com.bit.ecommerce.dao.impl.CartDaoImpl;
import com.bit.ecommerce.domain.Cart;
import com.bit.ecommerce.service.CartService;

public class CartServiceImpl implements CartService {

	private CartDao cartDao = new CartDaoImpl();
	
	@Override
	public void addToCart(Cart cart) {
		cartDao.save(cart);
	}

	@Override
	public List<Cart> getCartItems(int userId) {
		return cartDao.getAllByUserId(userId);
	}

}
