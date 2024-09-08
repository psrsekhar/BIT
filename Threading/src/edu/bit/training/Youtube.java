package edu.bit.training;

//Defining a thread
public class Youtube extends Thread {
	//job of a thread
	public void run() {
		System.out.println("In run().....");
		for(int i=0;i<10;i++) {
			System.out.println("run(): " + i);
		}
	}
}