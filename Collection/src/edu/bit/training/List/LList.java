package edu.bit.training.List;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LList {
	public static void main(String[] args) {

		List<String> info = new LinkedList<String>();// Generic type
		info.add("Samantha");
		info.addFirst("Sairam");
		info.addLast("Pooja");		
		info.add(3, "Barath");
		info.add(null);
		info.add("Samantha");
		
		info.forEach(System.out::println);
		System.out.println(info.getFirst());
		System.out.println(info.getLast());
		
		info.removeFirst();
		info.removeLast();
		info.forEach(System.out::println);
		
		
		Enumeration<String> enumeration = Collections.enumeration(info);
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
		
		//for List interface
		ListIterator<String> listIterator = info.listIterator();
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		//for Collection interface
		Iterator<String> iterator = info.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
















