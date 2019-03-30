package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorClass {


	public static void main(String[] args) {

		String s1 = "karthik";
		String s2 = "Test";
		
		List<String> list = new ArrayList<String>();

		list.add(s2);
		list.add(s1);

		Collections.sort(list,new Comparator<String>() {
			//Can user igonre case to compre whereas default is compareTo
			@Override
			public int compare(String o1, String o2) {
				return o1.compareToIgnoreCase(o2);
			}
		});

		System.out.println("SortedList = " + list.toString());
	}

}
