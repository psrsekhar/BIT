
// Target interface expected by the system
interface PaymentProcessor {
	void processPayment(double amount);
}

// Legacy class with incompatible interface
class OldPaymentGateway {
	public void makePayment(double amt) {
		System.out.println("Payment of " + amt + " processed via Old Gateway.");
	}
}

// Adapter - bridges the gap
class PaymentAdapter implements PaymentProcessor {
	private OldPaymentGateway oldGateway;

	public PaymentAdapter(OldPaymentGateway oldGateway) {
		this.oldGateway = oldGateway;
	}

	@Override
	public void processPayment(double amount) {
		oldGateway.makePayment(amount); 
	}
}

public class AdapterDemo {
	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentAdapter(new OldPaymentGateway());
		processor.processPayment(500.0);
	}
}
