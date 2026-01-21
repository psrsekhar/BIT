package com.amazon.service;

public interface DiscountStrategy {
	public Float calculateOrderPrice(Float orderPrice);
}
