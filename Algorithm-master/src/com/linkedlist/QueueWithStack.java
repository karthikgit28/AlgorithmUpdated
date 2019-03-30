package com.linkedlist;

import java.util.Stack;

public class QueueWithStack {
	
	static class Queue{
		static Stack<Integer> s1 = new Stack<Integer>();
		static Stack<Integer> s2 = new Stack<Integer>();
		
		static void enQueue(int x) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			s1.push(x);
			while(!s2.isEmpty()) {
				s1.push(s2.pop());
			}
		}
		
		static void deQueue() {
			if(s1.isEmpty()) {
				System.out.println("Queue is empty");
			}
			
			int x = s1.peek();
			s1.pop();
			System.out.println("Removed elemnt = " + x);
		}
		
	}


	public static void main(String[] args) {
		Queue.enQueue(1);
		Queue.enQueue(2);
		Queue.enQueue(3);
		
		Queue.deQueue();
		Queue.deQueue();
		Queue.deQueue();

	}

}
