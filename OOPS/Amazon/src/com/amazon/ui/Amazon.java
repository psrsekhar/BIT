package com.amazon.ui;

import com.amazon.dao.DiscountStrategyException;
import com.amazon.dao.DiscountStrategyImpl;
import com.amazon.dao.FreedomSale;

public class Amazon {

	public static void main(String[] args)throws DiscountStrategyException {
		
	}
}
/**
 		DiscountStrategyImpl strategy = new DiscountStrategyImpl(new FreedomSale());
		Float amount = -1000.0f;
		if(amount > 0) {
			System.out.println(strategy.getFinalAmount(amount));
		}else {
			throw new DiscountStrategyException("Amount is less than zero..");
		}
OrderController ui = new OrderController();
if(ui.OrderProcessing(new Order(1, 2, 2345.54f))) {
	System.out.println("Order processed...");
}else {
	System.err.println("Order processing failed... Please try again later...");
}
*/