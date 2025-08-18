package edu.bit.training;

public class Main {

	public static void main(String[] args) {
		Counter fCounter = new Counter("Counter A", 8);
		Counter sCounter = new Counter("Counter B", 7);
		Counter tCounter = new Counter("Counter C", 15);
		
		fCounter.start();
		sCounter.start();
		tCounter.start();
		
		try {
			fCounter.join();
			sCounter.join();
			tCounter.join();
		}catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println("Maximum tokens reached....");
	}

}