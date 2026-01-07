package com.bit.dao;

import com.bit.service.DiscountStrategy;

public class DiscountStrategyImpl {
	private DiscountStrategy discountStrategy;

	//Dependency Injection
	public DiscountStrategyImpl(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}

	public Float processOrderAmount(Float amount) {
		return this.discountStrategy.calculateOrderAmount(amount);
	}
}