package edu.bit.training;

public class Counter extends Thread {
	private static int token = 1;
	private String couterName;
	private int maxToken;
	private static final Object lock = new Object();
	
	public Counter(String couterName, int maxToken) {
		this.couterName = couterName;
		this.maxToken = maxToken;
	}
	
	@Override
	public void run() {
		for(int i=1; i<= maxToken; i++) {
			synchronized(lock) {
				System.out.println(this.couterName + "\t:\tToken Number:\t" + this.token);
				token++;
			}
		}
	}
}