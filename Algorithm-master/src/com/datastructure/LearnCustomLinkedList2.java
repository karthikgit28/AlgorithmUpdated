package com.datastructure;

public class LearnCustomLinkedList2 {
	
	Node head;
	
	public LearnCustomLinkedList2() {
		head = new Node();
		head.value = 0;
		head.link = null;
	}
	
	public boolean addNode(int item) {
		Node n = new Node();
		n.value = item;
		n.link = head;
		head = n;
		return true;
	}
	
	public boolean addNodeLast(int item) {
		Node n = new Node();
		
		Node old_Node = head;
		while(old_Node.link != null) {
			old_Node = old_Node.link;
		}
		n.value = item;
		n.link =null;
		old_Node.link = n;
		return true;
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
	
	public void printNodes() {
		Node z = head;
		while(z.link != null) {
			System.out.println(z.value);
			z = z.link;
		}
	}
	
	
	
	class  Node{
		private int value;
		private Node link;
	}

}
