package edu.bit.dsa.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();//initial capacity of 16
		Set<String> capacitySet = new HashSet<String>(20);//initial capacity of 20
		Set<String> capacityFillSet = new HashSet<String>(20, 0.5f);//initial capacity of 20 and fill ratio of 50%
		
		capacitySet.clear();
		capacityFillSet.clear();
		
		set.add("21");
		set.add("Samantha");
		set.add("143");
		set.add("Sairam");
		set.add("143");//set will not add this duplicate element and returns false
		
		System.out.println(set);
		
		set.stream().forEach(System.out::println);
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
}