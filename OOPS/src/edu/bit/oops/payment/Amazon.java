package edu.bit.oops.payment;

public class Amazon {

	public static void main(String[] args) {
		OrderService orderService = new OrderServiceImpl();
		Order order = new Order("3f1a2b4c-8d9e-4f6a-9b1c-123456789abc", "samantha", 312, 57);
		orderService.processOrder(order);
	}
	
}
