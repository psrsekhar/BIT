package edu.bit.dsa.queue;

import java.util.Deque;
import java.util.LinkedList;

public class LListQueue {

	public static void main(String[] args) {
		Deque<String> playlist = new LinkedList<String>();
		playlist.push("OO");
		playlist.push("KA");
		playlist.offer("RA");
		playlist.offer("DA");
		
		System.out.println(playlist);
	}
}