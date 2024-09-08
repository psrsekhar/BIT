package edu.bit.training.kfc;

import java.util.List;

public class SalesOperation extends Thread {
	private List<Integer> sales;
	private Integer sum = 0;
	
	public SalesOperation(List<Integer> sales) {
		this.sales = sales;
	}
	
	public void run() {
		System.out.println("Calculating sum of sales....");
		for(Integer sale: sales) {
			this.sum += sale;
		}
		System.out.println("Operation completed....");
	}
	
	public Integer getSum() {
		return this.sum;
	}
}