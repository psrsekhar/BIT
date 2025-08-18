package edu.bit.training;

public interface AnimalServ {
	//abstract methods
	public abstract void eat();
	public abstract void sleep();
	
	public static void getInfo() {
		System.out.println("Animal information");
	}
	//https://github.com/psrsekhar/BIT
	
	public default void printInfo() {
		System.out.println("Animal print info");
	}
}
