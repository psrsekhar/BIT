package edu.bit.training.abstraction;

public class Tiger extends Animal {
	private Integer numberOfLegs = 4;
	public Tiger() {
		System.out.println("Tiger()....");
	}
	
	{
		System.out.println("In anonymous block....");
	}

	public void search() {
		System.out.println("Tiger is searching for food...." + numberOfLegs);
	}
}
