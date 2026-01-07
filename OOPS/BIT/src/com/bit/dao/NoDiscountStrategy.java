package com.bit.dao;

import com.bit.service.DiscountStrategy;

public class NoDiscountStrategy implements DiscountStrategy {
	@Override
	public Float calculateOrderAmount(Float amount)  {
		return amount;
	}
}
