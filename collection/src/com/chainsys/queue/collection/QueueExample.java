package com.chainsys.queue.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<String> queue = new LinkedList<>();
		 
	        queue.add("apple");
	        queue.add("banana");
	        queue.add("cherry");
	 
	        System.out.println( queue);
	
	        String front = queue.remove();
	        System.out.println("Removed element: " + front);
	 
	        System.out.println("Queue after removal: " + queue);
	 
	        queue.add("date");
	 
	        String peeked = queue.peek();
	        System.out.println("Peeked element: " + peeked);
	 
	        System.out.println("Queue after peek: " + queue);

	}

}
