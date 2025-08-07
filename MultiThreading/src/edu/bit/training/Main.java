package edu.bit.training;

public class Main {

	public static void main(String[] args) {
		Sleep sleep = new Sleep();
		sleep.start();
		try {
			sleep.sleep(500);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}		
		
		for(int i=0; i<=10; i++) {
			System.out.println("In Main with i: " + i);
		}
	}
}
/**
System.out.println("Main thread executing.....");

Dominos dominos = new Dominos();
Thread dominosThread = new Thread(dominos);
dominosThread.setPriority(1);
dominosThread.start();

KFC kfcThread = new KFC();
kfcThread.setPriority(3);
kfcThread.start();
System.out.println("Main thread running.....");

System.out.println("Main Priority : " + Thread.currentThread().getPriority());

try {
	//main thread wait for other thread execution
	dominosThread.join();
	kfcThread.join();
} catch (InterruptedException e) {
	e.printStackTrace();
}

System.out.println("Profit: " + (Dominos.billSum - KFC.investmentSum));
*/