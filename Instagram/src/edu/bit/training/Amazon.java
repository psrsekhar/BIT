package edu.bit.training;

public class Amazon {

	public static void main(String[] args) {
		StrategyProcessor processor = new StrategyProcessor();
		PaymentStrategy ps = PaymentFactory.getPaymentObject(PaymentType.UPI);
		
		processor.setDiscountStrategy(new FreedomSale());
		ps.pay(processor.getFinalAmount(1000.0));
	}
}
