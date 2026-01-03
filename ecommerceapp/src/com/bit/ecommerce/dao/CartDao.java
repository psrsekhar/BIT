package com.bit.ecommerce.dao;

import java.util.List;

import com.bit.ecommerce.domain.Cart;

public interface CartDao {
	
	public void save(Cart cart);
	
	public List<Cart> getAllByUserId(int userId);

}
