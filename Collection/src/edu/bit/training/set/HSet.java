package edu.bit.training.set;

import java.util.HashSet;
import java.util.Set;

public class HSet {
	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();//implements HashMap
		names.add(null);
		names.add("Samantha");
		names.add("Sairam");
		names.add("Hansika");
		names.add("Monica");
		names.add("Monica");
		
		Set numbers = new HashSet();//implements HashMap
		numbers.add(null);
		numbers.add("Samantha");
		numbers.add(10);
		numbers.add(20);
		numbers.add(5);
		numbers.add(8);		
		
		System.out.println(names.size());		
		names.forEach(System.out::println);
		numbers.forEach(System.out::println);
	}

}
