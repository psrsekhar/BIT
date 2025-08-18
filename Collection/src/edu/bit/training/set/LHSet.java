package edu.bit.training.set;

import java.util.LinkedHashSet;

public class LHSet {

	public static void main(String[] args) {
		LinkedHashSet<String> brands = new LinkedHashSet<String>();
		brands.add(null);
		brands.add("Signature");
		brands.add("Old Monk");
		brands.addFirst("Old Monk");
		brands.addLast("Teachers");
		
		brands.removeFirst();
		
		System.out.println(brands.contains("Teachers"));
		
		brands.forEach(System.out::println);
		
		brands.clear();
		
	}

}
