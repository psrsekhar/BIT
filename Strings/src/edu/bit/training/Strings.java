package edu.bit.training;

public class Strings {

	public static void main(String[] args) {
		//String initializations
		StringBuffer actress= new StringBuffer();
		StringBuffer name= new StringBuffer("Samantha");
		
		name.append("loves Sairam");//initialize values
		String string = name.toString();
		
		System.out.println(name.reverse());//reveres a string
	}
}