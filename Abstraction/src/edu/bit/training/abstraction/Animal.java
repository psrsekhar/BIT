package edu.bit.training.abstraction;

public class Animal {
	public Animal() {
		System.out.println("Animal()....");
	}
	
	{
		System.out.println("Animal anonymous block....");
	}
	
	public void sleep() {
		System.out.println("Animal is sleeping");
	}
}