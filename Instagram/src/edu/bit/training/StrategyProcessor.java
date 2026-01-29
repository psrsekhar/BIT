package edu.bit.training;

//Strategy Context -> which algorithm should be selected?
public class StrategyProcessor {
	private DiscountStrategy discountStrategy;
	
	public void setDiscountStrategy(DiscountStrategy discountStrategy) {
		if(discountStrategy != null) {
			this.discountStrategy = discountStrategy;
		}else {
			throw new IllegalArgumentException();
		}		
	}
	
	public Double getFinalAmount(Double amount) {
		return discountStrategy.getFinalAmount(amount);
	}
}
