package com.datastructure;

public class StartedClass {
	
	public static void main(String[] args) {
//		IntStack stack = new IntStack();
//		if(stack.isEmpty()) {
//			System.out.println("Block");
//			stack.push(1);
//			stack.push(2);
//			stack.push(3);
//			stack.push(4);
//		}
//		
//		//System.out.println("Stack element is " + stack);
//		System.out.println("Stack pop element is " + stack.pop());
//		System.out.println("Stack pop element is " + stack.pop());
		
//		IntQueue queue = new IntQueue();
//		queue.enQueue(1);
//		queue.enQueue(2);
//		queue.enQueue(3);
//		queue.enQueue(4);
//		
//		System.out.println("Dequeue element is " + queue.deQueue());
//		System.out.println("Dequeue element is " + queue.deQueue());
		
		CustomLinkedList linked = new CustomLinkedList();
		linked.insertItem(2);
		linked.insertItem(3);
		linked.insertItem(4);
		linked.insertItem(6);
		
		linked.printList();
	}

}
