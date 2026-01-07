package com.bit.dao;

import com.bit.service.NotificationService;

public class SMSNotification implements NotificationService {
	@Override
	public void communicate(String message) {
		System.out.println("Sending sms....");
	}
}
