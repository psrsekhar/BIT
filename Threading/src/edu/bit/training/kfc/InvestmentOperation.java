package edu.bit.training.kfc;

import java.util.List;

public class InvestmentOperation extends Thread {
	private List<Integer> investments;
	private Integer sum = 0;
	
	public InvestmentOperation(List<Integer> investments) {
		this.investments = investments;
	}
	
	public void run() {
		System.out.println("Calculating sum of investments....");
		for(Integer investment: investments) {
			this.sum += investment;
		}
		System.out.println("Operation completed....");
	}
	
	public Integer getSum() {
		return this.sum;
	}
}
