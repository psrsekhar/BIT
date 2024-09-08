package edu.bit.training.token;

public class KFC {

	public static void main(String[] args) {
		//creating counter threads
		Thread counterA = new Thread(new TokenService("CounterA"));
		Thread counterB = new Thread(new TokenService("CounterB"));
		Thread counterC = new Thread(new TokenService("CounterC"));
		
		//starting the counter threads
		counterA.start();
		counterB.start();
		counterC.start();
	}
}