package com.amazon.dao;

import com.amazon.service.DiscountStrategy;

//Strategy implementation class
public class DiscountStrategyImpl {
	private DiscountStrategy discountStrategy;
	
	//Dependency Injection (DiscountSale objects are injected via constructor)
	public DiscountStrategyImpl(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}
	
	public Float getFinalAmount(Float orderPrice) {
		return this.discountStrategy.calculateOrderPrice(orderPrice);
	}
}
