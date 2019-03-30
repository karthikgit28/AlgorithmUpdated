package com.algorithm;

import java.util.ArrayList;

public class ArrayListClass {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add(null);
		list.add(null);
		list.add(0, "new");
		
		System.out.println("List = " + list);
		
	}

}
