package edu.bit.training.List;

import java.util.Stack;

public class S {

	public static void main(String[] args) {
		Stack<String> brands = new Stack<String>();
		brands.push(null);
		
		System.out.println("Before Pop Count: " + brands.size());
		System.out.println(brands.pop());//access and remove
		System.out.println("After Pop Count: " + brands.size());
		
		System.out.println("Before Peek Count: " + brands.size());
		if(!brands.empty()) {
			System.out.println(brands.peek());//access
		}
		while(!brands.empty()) {
			System.out.println(brands.pop());
		}
		System.out.println("After Peek Count: " + brands.size());
		
		brands.forEach(System.out::print);
	}
}
