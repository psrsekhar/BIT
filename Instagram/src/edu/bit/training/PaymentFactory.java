package edu.bit.training;

//Factory class -> which object should be created?
public class PaymentFactory {
	
	public static PaymentStrategy getPaymentObject(PaymentType paymentType) {
		return switch(paymentType) {
			case UPI -> new UPIService();
			case CARD -> new CardService();
			default -> null;
		};
	}
}
