package edu.bit;

//Strategy interface
interface NotificationService{
	public void send(String message);
}

interface EmailNotificationService extends NotificationService{
	public void send(String message, String attachment);
}

//Strategy implementation classes -> Concrete Strategy
class EmailServiceImpl implements EmailNotificationService{

	@Override
	public void send(String message) {
		System.out.println("Email : " + message);
	}

	@Override
	public void send(String message, String attachment) {
		System.out.println("Email : " + message +"\tAttachment: " + attachment);
	}	
}

class SmsServiceImpl implements NotificationService{

	@Override
	public void send(String message) {
		System.out.println("SMS : " + message);
	}	
}

class WhatsAppServiceImpl implements NotificationService{

	@Override
	public void send(String message) {
		System.out.println("WhatsApp : " + message);
	}	
}

//Strategy context
class NotificationStrategy{
	private NotificationService notificationService;
	
	public NotificationStrategy(NotificationService notificationService) {
		this.notificationService = notificationService;
	}
	
	public void setStrategy(NotificationService notificationService) {
		this.notificationService = notificationService;
	}
	
	public void notifyUser(String message) {
		notificationService.send(message);
	}
}

//Client
public class Notification {

	public static void main(String[] args) {
		NotificationStrategy emailStrategy = new NotificationStrategy(new EmailServiceImpl());
		emailStrategy.notifyUser("Welcome to BIT Online Store.....");	
		
		NotificationStrategy smsStrategy = new NotificationStrategy(new SmsServiceImpl());
		smsStrategy.notifyUser("Get lost from BIT Online Store.....");
	}

}












