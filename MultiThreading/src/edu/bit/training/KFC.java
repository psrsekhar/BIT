package edu.bit.training;

public class KFC extends Thread{
	public static int investmentSum = 0;
	int[] investmentList = {10, 200, 3000, 40000};
	@Override
	public void run() {
		System.out.println("KFC Priority : " + Thread.currentThread().getPriority());
		System.out.println("Investment loop about to start");
		for(int investment: investmentList) {
			investmentSum += investment;
		}
		System.out.println("Investment loop ended");
	}
}
