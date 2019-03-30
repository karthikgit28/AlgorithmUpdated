package com.algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
	
	public static void main(String[] args) {
		
		Queue<Integer> queue = new LinkedList<Integer>();
		for(int i=0;i<=10;i++) {
			queue.add(i);
		}
		System.out.println("elements " + queue);
		
		System.out.println("Remove elemt = "+ queue.remove());
		
		System.out.println("Peek element = "+ queue.peek());
		
		System.out.println("Final elements " + queue);
		
	}

}
