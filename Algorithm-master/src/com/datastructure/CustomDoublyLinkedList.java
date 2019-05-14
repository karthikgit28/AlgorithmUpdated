package com.datastructure;

public class CustomDoublyLinkedList {
	
	Node head;
	
	public CustomDoublyLinkedList(int item) {
		head = new Node();
		head.value = item;
		head.prev = null;
		head.next = null;
	}
	
	public boolean addNode(int item) {
		Node n = new Node();
		n.value = item;
		n.prev = null;
		head.prev = n;
		n.next = head;
		head = n;
		return true;
	}

	class Node{
		private int value;
		private Node prev;
		private Node next;
	}
}
