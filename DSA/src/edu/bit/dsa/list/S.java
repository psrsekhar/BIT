package edu.bit.dsa.list;

import java.util.Stack;

public class S {
	public static void main(String[] args) {
		Stack<String> history = new Stack<String>();
		history.push(null);
		history.push("google.com");
		history.push("chat.openai.com");
		history.push("bing.com");
		
		System.out.println("Stack is: " + history.isEmpty());
		
		System.out.println(history.peek());
		System.out.println(history);
		
		System.out.println(history.pop());
		System.out.println(history);
	}
}