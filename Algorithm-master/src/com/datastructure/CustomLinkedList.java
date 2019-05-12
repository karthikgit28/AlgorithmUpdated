package com.datastructure;

public class CustomLinkedList {

	private Node head;
	
	public CustomLinkedList() {
		head = new Node();
		head.value = 0;
		head.link = null;
	}
	
	public boolean insertItem(int item) {
		Node n = new Node();
		n.value = item;
		n.link = head;
		head = n;
		return true;
	}
	
	public boolean inserItemAtEndOfNode(int item) {
		Node n = new Node();
		
		Node old_Node = head;
		while(old_Node.link != null) {
			old_Node = old_Node.link;
		}
		n.value = item;
		n.link = null;
		old_Node.link = n;
		return true;
	}
	
	public void printList() {
		Node z = head.link;
		while(z != null) {
			System.out.println("Nodes are " + z.value);
			z = z.link;
		}
	}
	
	
	public boolean deleteNode(int item) {
		if(head.value == item) {
			head = head.link;
			return true;
		}else {
			Node x = head;
			Node y = head.link;
			while(true) {
				if(y == null || y.value == item) {
					break;
				}else {
					x = y;
					y = y.link;
				}
			}
			if(y != null) {
				x.link = y.link;
				return true;
			}else {
				return false;
			}
		}
		
		
	}
	
	class Node{
		private int value;
		private Node link;
	}
}
