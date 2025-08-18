package edu.bit.training.List;

import java.util.Vector;

public class V {

	public static void main(String[] args) {
		Vector<String> info = new Vector<String>();
		info.add("Samantha");
		info.add(1, "Sairam");
		System.out.println(info.capacity());//current capacity
		info.forEach(System.out::println);
	}
}