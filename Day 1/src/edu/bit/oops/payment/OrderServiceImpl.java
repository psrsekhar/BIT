package edu.bit.oops.payment;

public class OrderServiceImpl implements OrderService {

	@Override
	public void processOrder(Order order) {
		// concrete method
		saveOrder(order);
		generateInvoice(order);
		sendMail(order);
		sendSMS(order);
	}
	
	public void getAllOrders(){
		System.out.println("Order Information...");
	}

	private void saveOrder(Order order) {
		System.out.println("code for connecting to database....");
		System.out.println("Insert order details in Database....");
	}

	private void generateInvoice(Order order) {
		System.out.println("Generate Invoice..");
	}
	
	private void sendMail(Order order) {
		System.out.println("Send email to cutomer...");
	}
	
	private void sendSMS(Order order) {
		System.out.println("Send sms to cutomer...");
	}
}
