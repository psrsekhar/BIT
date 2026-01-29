package edu.bit.training;

//Strategy Interface
public interface DiscountStrategy {
	public Double getFinalAmount(Double amount);
}