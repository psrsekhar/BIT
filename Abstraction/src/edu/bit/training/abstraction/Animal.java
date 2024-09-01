package edu.bit.training.abstraction;

public abstract class Animal {
	
	//abstract method
	public abstract void eat();
	
	//concrete method
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
}