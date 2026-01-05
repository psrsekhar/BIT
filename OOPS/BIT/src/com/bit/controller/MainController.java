package com.bit.controller;

import com.bit.dao.PaymentServiceImpl;
import com.bit.model.Payment;
import com.bit.service.PaymentService;

public class MainController {

	public static void main(String[] args) {
		// Parent Reference and child class object : Partial Abstraction
		PaymentService paymentServiceImpl = new PaymentServiceImpl();
		paymentServiceImpl.savePaymentDetails(new Payment(6546451, 456.23f, "2026-01-05", "sam@143.com"));
	}
}







