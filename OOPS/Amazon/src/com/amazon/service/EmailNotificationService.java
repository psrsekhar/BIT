package com.amazon.service;

public interface EmailNotificationService {
	public void notificcationWithAttachment(String to, String message, String subject, String filePath);
}
