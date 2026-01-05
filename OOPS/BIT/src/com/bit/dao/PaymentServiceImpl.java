package com.bit.dao;

import com.bit.model.Payment;
import com.bit.service.PaymentService;

public class PaymentServiceImpl implements PaymentService {
	//Instance or concrete methods
	@Override
	public void savePaymentDetails(Payment payment) {
		System.out.println("Connecting to database...");
		getConnection();
		System.out.println("Payment info is stored in database..");
	}
	
	//method hiding or abstraction
	private void getConnection() {
		System.out.println("Database connected....");
	}
}
