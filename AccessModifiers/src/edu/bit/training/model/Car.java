package edu.bit.training.model;

public class Car {
	private String brand;//access with in the class
	public String name; //can be accessed anywhere
	protected String version;//can be accessed with in the package and subclass
	String color; //can be accessed with in the package
	
	//can be accessed anywhere
	public void display() {
		System.out.println(this.brand);
		encrypt();
	}

	//access with in the class
	private void encrypt() {
		System.out.println("encryption process");
	}
}