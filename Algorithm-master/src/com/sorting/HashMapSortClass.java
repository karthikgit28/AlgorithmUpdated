package com.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapSortClass {

	public static void main(String[] args) {

		Map<String,Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);

		List<Entry<String,Integer>> list = new LinkedList<Entry<String,Integer>>(map.entrySet());
		Collections.sort(list, new Comparator<Entry<String,Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		for(Entry<String,Integer> item : list) {
			System.out.println("Sorted Value Map = " + item);
		}

		List<Entry<String,Integer>> newList = new LinkedList<Entry<String,Integer>>(map.entrySet());
		Collections.sort(newList, new Comparator<Entry<String,Integer>>() {
			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				return o1.getKey().compareToIgnoreCase(o2.getKey());
			}
		});
		
		for(Entry<String,Integer> item : newList) {
			System.out.println("Sorted Key Map = " + item);
		}
	}

}
