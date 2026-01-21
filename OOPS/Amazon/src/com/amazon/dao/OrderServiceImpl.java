package com.amazon.dao;

import com.amazon.model.Order;
import com.amazon.service.OrderService;

public class OrderServiceImpl implements OrderService {

	@Override
	public Boolean saveOrder(Order order) {
		// save order in to database
		System.out.println("Connecting to database...");
		System.out.println("Inserting order details...");
		System.out.println("DB Connection closed....");
		return true;
	}
}