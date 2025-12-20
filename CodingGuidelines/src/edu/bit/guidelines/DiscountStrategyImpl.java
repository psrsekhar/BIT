package edu.bit.guidelines;

public class DiscountStrategyImpl implements DiscountStrategy {

	@Override
	public Integer getDiscountPercentage(Integer amount) {
		Integer discount = null;
		try {
			if (amount <= 1000) {
				discount = 20;
			} else if (amount >= 1001 && amount <= 2000) {
				discount = 30;
			} else {
				discount = 50;
			}			
		}catch(Exception ex) {
			System.err.print(ex.getMessage());
		}finally {
			//closing the resources
		}

		return discount;
	}
}
