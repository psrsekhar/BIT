package edu.bit.training;

public class Main {
	public static void main(String[] args) {
		Actress actress1 = new Actress("Samantha", 21, 80);
		Actress actress2 = new Actress("Samantha", 21, 80);
		Actress actress3 = new Actress("Trisha", 21, 80);	
		System.out.println(actress1.equals(actress2));//returns true
		System.out.println(actress1.equals(actress3));//returns false
	}
}