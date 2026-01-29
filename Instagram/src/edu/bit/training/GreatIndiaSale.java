package edu.bit.training;

public class GreatIndiaSale implements DiscountStrategy {
	@Override
	public Double getFinalAmount(Double amount) {
		return amount - (amount * 0.1);
	}
}
