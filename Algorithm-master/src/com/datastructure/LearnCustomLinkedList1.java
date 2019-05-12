package com.datastructure;

public class LearnCustomLinkedList1 {
	
	private Node head;
	
	public LearnCustomLinkedList1(int item) {
		head = new Node();
		head.value= item;
		head.link = null;
	}
	
	public boolean addNode(int item) {
		Node n = new Node();
		n.value = item;
		n.link = head;
		head = n;
		return true;
	}
	
	public boolean addNodeAtLast(int item) {
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
	
	public void printAll() {
		Node z = head;
		while(z != null) {
			System.out.println("Node emelemts = " + z.value);
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
