package edu.bit.training.files;

public class Test {
	public static void main(String[] args) {
		System.out.println("Test class......");
		Test.main(null);//recursive dead lock call
	}

}