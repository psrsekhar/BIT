package com.amazon.dao;

import com.amazon.service.EmailNotificationService;
import com.amazon.service.NotificationService;

public class EmailService implements NotificationService, EmailNotificationService {

	@Override
	public void notificcation(String to, String message, String subject) {
		System.out.println("Sending mail with invoice...");
		System.out.println("Mail sent with invoice...");
	}

	@Override
	public void notificcationWithAttachment(String to, String message, String subject, String filePath) {
		// TODO Auto-generated method stub
		
	}

}
