package com.datastructure;

public class IntQueue {
	
	private int[] queue;
	private int total;
	private int size;
	private int rear;
	private int front;
	
	public IntQueue() {
		total = 0;
		size = 100;
		rear = 0;
		front = 0;
		queue = new int[size];
	}
	
	public boolean enQueue(int item) {
		if(!isFull()) {
			total++;
			queue[rear] = item;
			rear++;
			return true;
		}else {
			return false;
		}
		
	}
	
	public boolean isFull() {
		return size == total;
	}
	
	public int deQueue() {
		int item =  queue[front];
		total--;
		front++;
		return item;
	}

}
