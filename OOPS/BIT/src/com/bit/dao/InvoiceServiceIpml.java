package com.bit.dao;

import com.bit.model.Order;
import com.bit.service.InvoiceService;

public class InvoiceServiceIpml implements InvoiceService {

	@Override
	public void generateInvoice(Order order) {
		System.out.println("Invoice generation started from order details......");
		System.out.println("Invoice generated and saved in storage server......");
	}

}
