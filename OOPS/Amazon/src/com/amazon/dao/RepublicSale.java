package com.amazon.dao;

import com.amazon.service.DiscountStrategy;

public class RepublicSale implements DiscountStrategy {
	@Override
	public Float calculateOrderPrice(Float orderPrice) {
		return (float) (orderPrice - (orderPrice * 0.25));
	}
}
