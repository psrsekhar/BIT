package com.bit.dao;

import com.bit.service.NotificationService;

public class NotificationServiceImpl implements NotificationService {

	@Override
	public void communicate(String mode) {
		if (mode.equals("email")) {
			System.out.println("Sending an email using gmail with invoice attachment....");
			System.out.println("Email sent....");
		} else {
			System.out.println("Sending an sms with order info....");
			System.out.println("SMS sent..");
		}
	}

}
