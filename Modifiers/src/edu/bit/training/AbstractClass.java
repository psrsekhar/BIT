package edu.bit.training;

//abstract class
public abstract class AbstractClass {
	public AbstractClass() {
		System.out.println("AbstractClass() is called....");
	}
	
	public void greet() {
		System.out.println("Hello...");
	}
	
	//abstract method
	public abstract void eat();
}
