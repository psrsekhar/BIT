package edu.bit.training;

public class Sleep extends Thread {
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("In Sleep with i: " + i);
		}
	}
}
