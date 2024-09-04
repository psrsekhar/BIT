package edu.bit.dsa.list;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public class AList {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();

		numbers.add(143);
		numbers.add(143);
		numbers.add(2, 341);
		
		Iterator<Integer> iterator = numbers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Random Access
		System.out.println(numbers instanceof RandomAccess);
		System.out.println("Index of 3: " + numbers.get(3));

		// Serialiazation
		System.out.println(numbers);
		System.out.println(numbers instanceof Serializable);

		// Object cloning
		System.out.println(numbers instanceof Cloneable);

		numbers.stream().forEach(System.out::println);

		numbers.add(2);
		numbers.add(3);
		System.out.println(numbers);

		// remove using index
		numbers.remove(2);
		System.out.println(numbers);

		// remove using value
		numbers.remove(Integer.valueOf(143));
		System.out.println(numbers);
	}
}