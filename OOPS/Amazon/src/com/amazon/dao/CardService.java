package com.amazon.dao;

import com.amazon.service.PaymentProcessing;

public class CardService implements PaymentProcessing {

	@Override
	public void pay(Float amount) {
		// code to implement card payment using ccvenue/razorpay gateway
	}

}
