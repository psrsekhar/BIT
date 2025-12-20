package edu.bit.oops.payment;

public class OrderServiceImpl implements OrderService {

	@Override
	public void processOrder(Order order) {
		// concrete method
		saveOrder(order);
		InvoiceGenerator invoice = new InvoiceGenerator();
		invoice.generateInvoice(order);
	}

	@Override
	public void getAllOrders() {
		System.out.println("Order Information...");
	}

	private void saveOrder(Order order) {
		System.out.println("code for connecting to database....");
		System.out.println("Insert order details in Database....");
	}

}

//Cohesive classes
class InvoiceGenerator {
	public void generateInvoice(Order order) {
		System.out.println("Generate Invoice..");
	}
}

class EmailNotificationService {
	public void sendMail(Order order) {
		System.out.println("Send email to cutomer...");
	}
}

class SMSNoificationService {
	public void sendSMS(Order order) {
		System.out.println("Send sms to cutomer...");
	}
}