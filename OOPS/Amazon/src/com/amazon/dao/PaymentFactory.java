package com.amazon.dao;

import com.amazon.service.PaymentProcessing;

//factory class to create objects based on input
public class PaymentFactory {


	public PaymentProcessing getPaymentObject(PaymentMethod paymentMethod) {
		
		return switch (paymentMethod) {
		case UPI -> new UPIService();
		case CARD -> new CardService();
		default -> throw new IllegalArgumentException("Unexpected value: " + paymentMethod);
		};
	}
}