package edu.bit;

//Client
public class Main {

	public static void main(String[] args) {
		String mode = "card";
		PaymentService paymentService = PaymentFactory.getPaymentObject(mode);
		paymentService.savePaymentInfo();
	}
}
