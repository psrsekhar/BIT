package edu.bit.training;

public class CardService implements PaymentStrategy {
	@Override
	public void pay(double amount) {
		System.out.println("Payment("+amount+") is processing through UPI...");
	}
}
