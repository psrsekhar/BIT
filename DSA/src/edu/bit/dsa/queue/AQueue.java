package edu.bit.dsa.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class AQueue {
	public static void main(String[] args) {
		Deque<String> songs = new ArrayDeque<String>();
		songs.push("OO");
		songs.push("Leo");
		songs.push("Vikram");
		songs.push("Jailer");
		songs.offer("EE");
		
		System.out.println(songs);
	}
}