package edu.bit.dsa.list;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public class LList {
	public static void main(String[] args) {
		List<String> fruits = new LinkedList<String>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Jack Fruit");
		fruits.addLast("Orange");
		fruits.addFirst("Banana");
		
		ListIterator<String> listIterator = fruits.listIterator();
		String fr = null;
		//forward traversing
		while(listIterator.hasNext()) {
			fr = listIterator.next();
			System.out.println(fr);
			if(fr.equals("Mango")) {
				listIterator.add("Papaya");
			}
		}
		
		//backward traversing
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
		
		System.out.println(fruits.removeFirst());
		System.out.println(fruits);
		System.out.println(fruits.removeLast());
		System.out.println(fruits);
		
		System.out.println(fruits instanceof Serializable);
		System.out.println(fruits instanceof Cloneable);
		System.out.println(fruits instanceof RandomAccess);
	}
}