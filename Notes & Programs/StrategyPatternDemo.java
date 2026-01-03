
// Strategy Interface
interface PaymentStrategy {
	void pay(int amount);
}

// Concrete Strategies
class CreditCardPayment implements PaymentStrategy {
	public void pay(int amount) {
		System.out.println("Paid " + amount + " using Credit Card.");
	}
}

class PayPalPayment implements PaymentStrategy {
	public void pay(int amount) {
		System.out.println("Paid " + amount + " using PayPal.");
	}
}

class UpiPayment implements PaymentStrategy {
	public void pay(int amount) {
		System.out.println("Paid " + amount + " using UPI.");
	}
}

// Context
class ShoppingCart {
	private PaymentStrategy paymentStrategy;

	public void setPaymentStrategy(PaymentStrategy ps) {
		this.paymentStrategy = ps;
	}

	public void checkout(int amount) {
		paymentStrategy.pay(amount);
	}
}

// Usage
public class StrategyPatternDemo {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.setPaymentStrategy(new CreditCardPayment());
		cart.checkout(500);

		cart.setPaymentStrategy(new PayPalPayment());
		cart.checkout(300);
	}
}
