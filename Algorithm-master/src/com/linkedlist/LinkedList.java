package com.linkedlist;

public class LinkedList {

	Node head;

	public void push(int newData) {
		Node new_node = new Node(newData);
		new_node.next = head;
		head = new_node;
	}

	public int getCount() {
		int count = 0;
		Node temp = head;
		while(temp!= null) {
			count++;
			temp = temp.next;
		}
		return count;
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
		LinkedList list = new LinkedList();
		list.push(1);
		list.push(2);
		list.push(3);
		System.out.println("List size = " + list.getCount());

	}

}
