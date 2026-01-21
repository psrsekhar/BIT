package com.amazon.dao;

import java.security.InvalidParameterException;

import com.amazon.service.DiscountStrategy;

public class FreedomSale implements DiscountStrategy {
	@Override
	public Float calculateOrderPrice(Float orderPrice) {
		return (float) (orderPrice - (orderPrice * 0.2));
	}
}
