package com.algorithm;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {
	
	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("new1");
		list.add("new2");
		list.add("new3");
		list.add("new4");
		list.addFirst("first");
		
		System.out.println("Element = " + list);
		
		ListIterator<String> iterate = list.listIterator(list.size());
		while(iterate.hasPrevious()) {
			System.out.println("previous element = " + iterate.previous());
		}
		
	}

}
