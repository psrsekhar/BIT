package edu.bit.training.queue;

import java.util.Deque;
import java.util.LinkedList;

public class LList {

	public static void main(String[] args) {
		Deque<String> processList = new LinkedList<String>();
		processList.offer("Notepad");
		processList.offer("MS Wprd");
		processList.offerFirst(null);
		
		System.out.println(processList.peekFirst());
		System.out.println(processList.peekLast());
		System.out.println(processList.peek());
		
		System.out.println(processList.pollFirst());
		System.out.println(processList.pollLast());
		System.out.println(processList.poll());
	}
}