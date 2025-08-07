package edu.bit.training;

public class StrictFP {
	public static strictfp void calculate() {
		double fNumber = 21.3456/78.6543;
		double sNumber = Math.pow(98.789, 78.25);
		System.out.println(fNumber + "\t" +sNumber);
	}
}