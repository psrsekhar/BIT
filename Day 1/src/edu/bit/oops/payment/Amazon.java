package edu.bit.oops.payment;

public class Amazon {

	public static void main(String[] args) {
		OrderService orderService = new OrderServiceImpl();
		orderService.processOrder(null);	
		orderService.getAllOrders();
	}

}
