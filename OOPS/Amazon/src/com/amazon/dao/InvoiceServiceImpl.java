package com.amazon.dao;

import com.amazon.model.Order;
import com.amazon.service.InvoiceService;

public class InvoiceServiceImpl implements InvoiceService {
	@Override
	public void generateOrderInvoice(Order order) {
		System.out.println("Generating invoice from order info...");
		System.out.println("Invoice saved in Storage server...");
	}
}
