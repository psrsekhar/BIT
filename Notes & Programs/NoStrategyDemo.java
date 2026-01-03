
class ShoppingCart {
	public void checkout(String paymentType, int amount) {
		if (paymentType.equals("credit")) {
			System.out.println("Paid " + amount + " using Credit Card.");
		} else if (paymentType.equals("paypal")) {
			System.out.println("Paid " + amount + " using PayPal.");
		} else if (paymentType.equals("upi")) {
			System.out.println("Paid " + amount + " using UPI.");
		}
	}
}

public class NoStrategyDemo {
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		cart.checkout("credit", 500);
	}
}
