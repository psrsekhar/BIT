package com.bit.ecommerce.controller;

import java.util.List;

import com.bit.ecommerce.domain.Cart;
import com.bit.ecommerce.service.CartService;
import com.bit.ecommerce.service.impl.CartServiceImpl;

public class CartController {
	
	private CartService cartService = new CartServiceImpl();
	
	public void addToCart(int userId, int productId, int quantity) {
		Cart cart = new Cart();
		cart.setUserId(userId);
		cart.setProductId(productId);
		cart.setQuantity(quantity);
		cartService.addToCart(cart);
	}
	
	public List<Cart> getCartItems(int userId) {
		return cartService.getCartItems(userId);
	}
}
