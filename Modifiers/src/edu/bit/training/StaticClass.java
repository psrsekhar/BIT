package edu.bit.training;

public class StaticClass {
	static class InnerClass{
		//inner class can be static
	}
	
	public Integer age = 16;//Instance variable
	public static final String name = "Samantha";//class variable
	
	//concrete or instance method
	public void display() {
		System.out.println("I am displaying...");
	}
	
	//concrete or static method
	public static void greet() {
		System.out.println(name + " \tbelongs to Static class....");
	}
}
