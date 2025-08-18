package edu.bit.training.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQueue {

	public static void main(String[] args) {
		Queue<String> orders = new PriorityQueue<String>();
		orders.add("Order1");
		orders.offer("Order2");
		orders.offer("Order3");
		
		//orders.add(null); RE: NullPointerException
		
		System.out.println(orders.peek());//only access
		
		System.out.println(orders.poll());//access and remove
	}

}
