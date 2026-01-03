interface EmailNotification {
	void sendEmail(String message);
}

interface SMSNotification {
	void sendSMS(String message);
}

interface PushNotification {
	void sendPush(String message);
}

// Marketing Notifications
class MarketingEmail implements EmailNotification {
	public void sendEmail(String message) {
		System.out.println("Marketing EMAIL: " + message);
	}
}

class MarketingSMS implements SMSNotification {
	public void sendSMS(String message) {
		System.out.println("Marketing SMS: " + message);
	}
}

class MarketingPush implements PushNotification {
	public void sendPush(String message) {
		System.out.println("Marketing PUSH: " + message);
	}
}

// Security Notifications
class SecurityEmail implements EmailNotification {
	public void sendEmail(String message) {
		System.out.println("Security EMAIL: " + message);
	}
}

class SecuritySMS implements SMSNotification {
	public void sendSMS(String message) {
		System.out.println("Security SMS: " + message);
	}
}

class SecurityPush implements PushNotification {
	public void sendPush(String message) {
		System.out.println("Security PUSH: " + message);
	}
}

interface NotificationFactory {
	EmailNotification createEmailNotification();

	SMSNotification createSMSNotification();

	PushNotification createPushNotification();
}

class MarketingNotificationFactory implements NotificationFactory {
	public EmailNotification createEmailNotification() {
		return new MarketingEmail();
	}

	public SMSNotification createSMSNotification() {
		return new MarketingSMS();
	}

	public PushNotification createPushNotification() {
		return new MarketingPush();
	}
}

class SecurityNotificationFactory implements NotificationFactory {
	public EmailNotification createEmailNotification() {
		return new SecurityEmail();
	}

	public SMSNotification createSMSNotification() {
		return new SecuritySMS();
	}

	public PushNotification createPushNotification() {
		return new SecurityPush();
	}
}

public class AbstractFactoryNotificationDemo {
	public static void main(String[] args) {
		// Choose Marketing family
		NotificationFactory marketingFactory = new MarketingNotificationFactory();
		marketingFactory.createEmailNotification().sendEmail("Big Sale Today!");
		marketingFactory.createSMSNotification().sendSMS("50% OFF on all items!");
		marketingFactory.createPushNotification().sendPush("Flash Deal Alert!");

		// Choose Security family
		NotificationFactory securityFactory = new SecurityNotificationFactory();
		securityFactory.createEmailNotification().sendEmail("Suspicious login detected.");
		securityFactory.createSMSNotification().sendSMS("Your OTP is 123456.");
		securityFactory.createPushNotification().sendPush("Password changed successfully.");
	}
}
