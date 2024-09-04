package edu.bit.training;

public class Samantha{
	// Step 1: Create a private static instance of the class
	private static Samantha instance;
	
	// Step 2: Make the constructor private so that this class cannot be instantiated from outside
	private Samantha() {
		System.out.println("In Samantha()");
	}
	
	// Step 3: public static method to get the instance of the class
	public static Samantha getInstance() {
		if(instance == null) {
			// Lazy initialization
			instance = new Samantha();
		}
		return instance;
	}
	
	public void renumeration() {
		System.out.println("Samantha is charging 100000 ruppes per hour.....");
	}
}
