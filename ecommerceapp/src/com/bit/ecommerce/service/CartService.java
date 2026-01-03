package com.bit.ecommerce.service;

import java.util.List;

import com.bit.ecommerce.domain.Cart;

public interface CartService {
	
	public void addToCart(Cart cart);
	
	public List<Cart> getCartItems(int userId);
	
}
