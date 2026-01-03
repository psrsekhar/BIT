interface Notification {
	void notifyUser(String message);
}

class EmailNotification implements Notification {
	public void notifyUser(String message) {
		System.out.println("Sending EMAIL: " + message);
	}
}

class SMSNotification implements Notification {
	public void notifyUser(String message) {
		System.out.println("Sending SMS: " + message);
	}
}

class PushNotification implements Notification {
	public void notifyUser(String message) {
		System.out.println("Sending PUSH Notification: " + message);
	}
}

class NotificationFactory {
	public static Notification getNotification(String type) {
		if (type.equalsIgnoreCase("email")) {
			return new EmailNotification();
		} else if (type.equalsIgnoreCase("sms")) {
			return new SMSNotification();
		} else if (type.equalsIgnoreCase("push")) {
			return new PushNotification();
		}
		throw new IllegalArgumentException("Unknown notification type: " + type);
	}
}

public class FactoryNotificationDemo {
	public static void main(String[] args) {
		Notification n1 = NotificationFactory.getNotification("email");
		n1.notifyUser("Welcome to our platform!");

		Notification n2 = NotificationFactory.getNotification("sms");
		n2.notifyUser("Your OTP is 123456");

		Notification n3 = NotificationFactory.getNotification("push");
		n3.notifyUser("You have a new message.");
	}
}
