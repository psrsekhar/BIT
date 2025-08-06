package edu.bit.training;

public class DogService implements AnimalServ {

	// concrete methods
	@Override
	public void eat() {
		hunt();
		System.out.println("Dog is eating....");
	}

	@Override
	public void sleep() {
		System.out.println("Animal is sleeping...");
	}
	
	private void hunt() {
		System.out.println("Dog is hunting....");
	}	
}