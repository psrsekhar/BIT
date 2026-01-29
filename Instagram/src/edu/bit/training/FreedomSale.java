package edu.bit.training;

//Concrete strategies (implementation classes)
public class FreedomSale implements DiscountStrategy {
	@Override
	public Double getFinalAmount(Double amount) {
		return amount - (amount * 0.05);
	}
}
