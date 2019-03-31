package com.sorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class HashMapStream {
	
	public static void main(String[] args) {
		
		Map<String,Integer> oldMap = new HashMap<String,Integer>();
		oldMap.put("ten",10);
		oldMap.put("twenty",20);
		oldMap.put("five",5);
		oldMap.put("one",1);
		
		//Keycompare
		oldMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::print);
		
		//Value compare
		oldMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::print);
		
		
		Map<Employee,Integer> map = new HashMap<Employee,Integer>();
		map.put(new Employee(1, "karthik", 1000),10);
		map.put(new Employee(2, "vinoth", 500),20);
		map.put(new Employee(3, "hari",2000),5);
		map.put(new Employee(4, "mani", 200),1);
		
		//Comparig key
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName).reversed())).forEach(System.out::println);
		
		//Other way
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(e-> ((Employee)e ).getName()))).forEach(System.out::println);
		
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);

		
	}

}
