package com.datastructure;

public class BinarySearchTree {

	Node root;

	public void add(int value) {
		Node nodeToAdd = new Node(value);

		if(root == null) {
			root = nodeToAdd;
		}

		Node traverseNode = root;
		traverseAndAddNode(traverseNode,nodeToAdd);
	}

	private void traverseAndAddNode(Node traverseNode,Node nodeToBeAdded) {
		if(nodeToBeAdded.value < traverseNode.value) {
			if(traverseNode.leftChild == null) {
				traverseNode.leftChild = nodeToBeAdded;
			}else {
				traverseAndAddNode(traverseNode.leftChild,nodeToBeAdded);	
			}

		}else if(nodeToBeAdded.value > traverseNode.value) {
			if(traverseNode.rightChild == null) {
				traverseNode.rightChild = nodeToBeAdded;
			}else {
				traverseAndAddNode(traverseNode.rightChild,nodeToBeAdded);	
			}
		}
	}

	public void traverse() {
		if(root != null) {
			Node traverseNode = root;

			if(traverseNode.leftChild == null && traverseNode.rightChild == null) {
				System.out.println(traverseNode.value);
			}else {
				//If u dont need to print rootnode use this code
				//				if(traverseNode.leftChild != null) {
				//					inOrderTraverse(traverseNode.leftChild);
				//				}
				//
				//				if(traverseNode.rightChild != null) {
				//					inOrderTraverse(traverseNode.rightChild);
				//				}

				//To print along with root node
				//inOrderTraverse(traverseNode);

				//preOrderTraverse(traverseNode);
				postOrderTraverse(traverseNode);
			}
		}
	}

	private void inOrderTraverse(Node node) {

		if(node.leftChild != null) {
			inOrderTraverse(node.leftChild);
		}

		System.out.println(node.value);

		if(node.rightChild != null) {
			inOrderTraverse(node.rightChild);
		}
	}


	private void preOrderTraverse(Node node) {

		System.out.println(node.value);

		if(node.leftChild != null) {
			inOrderTraverse(node.leftChild);
		}

		if(node.rightChild != null) {
			inOrderTraverse(node.rightChild);
		}
	}


	private void postOrderTraverse(Node node) {

		if(node.leftChild != null) {
			inOrderTraverse(node.leftChild);
		}

		if(node.rightChild != null) {
			inOrderTraverse(node.rightChild);
		}

		System.out.println(node.value);
	}

	public Node find(int val) {
		if(root != null) {
			return findNode(root,new Node(val));
		}
		return null;
	}

	private Node findNode(Node search,Node node) {
		if(search == null) {
			return null;
		}

		if(search.value == node.value) {
			return search;
		}else {
			Node returnNode = findNode(search.leftChild, node);
			if(returnNode == null) {
				returnNode = findNode(search.rightChild, node);
			}
			return returnNode;
		}
	}



	class Node{

		Node leftChild;
		Node rightChild;
		int value;

		public Node() {

		}

		public Node(int value) {
			this.value = value;
		}

		public void setLeftChild(Node leftChild) {
			this.leftChild = leftChild;
		}
		public void setRightChild(Node rightChild) {
			this.rightChild = rightChild;
		}
		public Node getLeftChild() {
			return leftChild;
		}
		public Node getRightChild() {
			return rightChild;
		}
		public int getValue() {
			return value;
		}
	}
}
