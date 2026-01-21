package com.amazon.service;

import com.amazon.model.Order;

public interface InvoiceService {
	public void generateOrderInvoice(Order order);
}
