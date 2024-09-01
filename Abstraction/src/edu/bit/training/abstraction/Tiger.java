package edu.bit.training.abstraction;

public class Tiger extends Animal{

	//implementation of abstract class abstract method
	@Override
	public void eat() {
		search();
		hunt();
		System.out.println("Tiger is eating");
	}
	
	private void search() {
		System.out.println("Tiger is searching for food....");
	}
	
	private void hunt() {
		System.out.println("Tiger is hunting....");
	}
}
