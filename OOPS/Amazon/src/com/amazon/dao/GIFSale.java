package com.amazon.dao;

import com.amazon.service.DiscountStrategy;

public class GIFSale implements DiscountStrategy {
	@Override
	public Float calculateOrderPrice(Float orderPrice) {
		return (float) (orderPrice - (orderPrice * 0.25));
	}
}
