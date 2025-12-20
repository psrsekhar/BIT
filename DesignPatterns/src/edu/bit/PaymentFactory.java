package edu.bit;

//Factory class to create objects based on input
public class PaymentFactory {
	private static PaymentService paymentService;

	public static PaymentService getPaymentObject(String mode) {
		if (mode.equalsIgnoreCase("UPI")) {
			return new UPIPaymentServiceImpl();
		} else if (mode.equalsIgnoreCase("CARD")) {
			return new CardPaymentServiceImpl();
		}
		return paymentService;
	}

}
