package com.bit.dao;

import java.security.InvalidParameterException;

import com.bit.service.DiscountStrategy;

public class FreedomSaleStrategy implements DiscountStrategy {

	@Override
	public Float calculateOrderAmount(Float amount) {
		return (float) (amount - (amount * 0.25));
	}

}
