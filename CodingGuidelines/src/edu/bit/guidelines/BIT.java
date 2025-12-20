package edu.bit.guidelines;

public class BIT {
	public static void main(String[] args) throws DiscountException {
		int amount = -1000;
		if (amount > 0) {
			DiscountStrategy discountStrategy = new DiscountStrategyImpl();
			System.out.println(discountStrategy.getDiscountPercentage(amount));
		} else {
			// throw new IllegalArgumentException();
			throw new DiscountException("Invalid input for amount..");
		}
	}
	
}