package edu.bit.training;

public class BITSale implements DiscountStrategy {
	@Override
	public Double getFinalAmount(Double amount) {
		return amount - (amount * 0.3);
	}
}
