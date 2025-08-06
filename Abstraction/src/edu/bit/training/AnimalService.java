package edu.bit.training;

public abstract class AnimalService {
	//constructor
	public AnimalService() {
		System.out.println("AnimalService().....");
	}
	
	//abstract methods
	public abstract void eat();
	public abstract void move();
	
	//concrete method
	public final void sleep() {
		System.out.println("Animal is sleeping.....");
	}
}
