package edu.bit.training;

public class Main {
	public static void main(String[] args) {
		// Step 4: Get the only object available
		Samantha sairam = Samantha.getInstance();
		Samantha samantha = Samantha.getInstance();
		
		if(sairam == samantha) {
			System.out.println("Samantha is dedicated to sairam");
		}else {
			System.out.println("Get lost.....");
		}
		// Step 5: Show the renumeration
		sairam.renumeration();
	}
}