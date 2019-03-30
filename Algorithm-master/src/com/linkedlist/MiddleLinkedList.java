package com.linkedlist;

public class MiddleLinkedList {
	
	Node head;
	
	public void push(int data) {
		Node new_data = new Node(data);
		new_data.next = head;
		head = new_data;
	}
	
	void middle() {
		Node slw_ptr = head;
		Node fast_ptr = head;
		if(head != null) {
			while(fast_ptr != null && fast_ptr.next != null) {
				fast_ptr = fast_ptr.next.next;
				slw_ptr = slw_ptr.next;
			}
			System.out.println("Middle elemetn = " + slw_ptr.data);
		}
	}
	

	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		MiddleLinkedList list = new MiddleLinkedList();
		list.push(1);
		list.push(2);
		list.push(3);
		list.push(4);
		list.push(5);
		
		list.middle();
		
	}
	
}
