package edu.bit.training;

public class Dominos implements Runnable{
	public static int billSum = 0;
	@Override
	public void run() {
		System.out.println("Dominos Priority : " + Thread.currentThread().getPriority());
		int[] billList = {432, 456, 653, 23456, 632, 245, 87654, 123456};
		Thread.currentThread().setName("Thread-Dominos");
		System.out.println("Bill loop about to start");
		for(int bill: billList) {
			billSum += bill;
		}
		System.out.println("Bill loop ended");
	}

}
