package com.bit.dao;

import com.bit.service.NotificationService;
import com.bit.service.NotificationWithAttachmentService;

public class EmailNotification implements NotificationService, NotificationWithAttachmentService {
	@Override
	public void communicate(String message) {
		System.out.println("Sending email....");
	}

	@Override
	public void communicateWithAttachment(String message) {
		System.out.println("Sending email with attachment....");
	}

}
