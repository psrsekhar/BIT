package com.amazon.controller;

import com.amazon.dao.OrderServiceImpl;
import com.amazon.model.Order;
import com.amazon.service.OrderService;

public class OrderController {
	
	public Boolean OrderProcessing(Order order) {
		//code to validate input		
		OrderService orderService = new OrderServiceImpl();
		return orderService.saveOrder(order);
	}
}
