package com.bit.dao;

import com.bit.model.Order;
import com.bit.service.InvoiceService;
import com.bit.service.NotificationService;
import com.bit.service.OrderService;

public class OrderServiceImpl implements OrderService{
	private InvoiceService invoiceService;
	private NotificationService notificationService;
	
	@Override
	public Boolean saveOrder(Order order) {
		invoiceService = new InvoiceServiceIpml();
		notificationService = new NotificationServiceImpl();
		
		invoiceService.generateInvoice(order);
		
		System.out.println("Connecting to database....");
		System.out.println("Order info saved into database....");
		System.out.println("Disconneced from database....");
		
		notificationService.communicate("email");
		notificationService.communicate("sms");
		
		System.out.println("Service completed");
		return true;
	}

}
