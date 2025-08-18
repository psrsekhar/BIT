package edu.bit.training.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TSet {

	public static void main(String[] args) {
		SortedSet elements = new TreeSet();
		elements.add(20);
		elements.add(12);
		elements.add(45);
		//elements.add(null);  => RE: NullPointerException
		
		elements.forEach(System.out::println);
		
		System.out.println(elements.headSet(20));
		System.out.println(elements.tailSet(12));
		System.out.println(elements.first());
		System.out.println(elements.last());
	}
}