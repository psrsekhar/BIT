package edu.bit.training;

public class PaymentProcessor {
	private PaymentStrategy paymentStrategy;
	
	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
		if(paymentStrategy != null) {
			this.paymentStrategy = paymentStrategy;
		}else {
			throw new IllegalArgumentException();
		}		
	}
	
	public void processPayment(Double amount) {
		paymentStrategy.pay(amount);
	}
}
