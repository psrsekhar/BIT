package com.amazon.dao;

//will not implement DiscountStrategy(Parent Interface)
public class NoDiscountSale {

	public Float calculateOrderPrice(Float orderPrice) {
		return orderPrice;
	}
}