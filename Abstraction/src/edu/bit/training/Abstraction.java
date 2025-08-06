package edu.bit.training;

public class Abstraction {

	public static void main(String[] args) {
		// parent reference with child object
		AnimalServ animalService = new DogService();
		animalService.eat();
		animalService.sleep();
	}
}