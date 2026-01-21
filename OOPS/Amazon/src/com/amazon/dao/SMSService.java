package com.amazon.dao;

import com.amazon.service.NotificationService;

public class SMSService implements NotificationService {

	@Override
	public void notificcation(String to, String message, String subject) {
		System.out.println("Sending sms with order info ...");
		System.out.println("SMS sent with order info...");
	}
}
