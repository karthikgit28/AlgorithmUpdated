package com.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamSort {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(5);
		list.add(4);
		list.add(8);
		list.add(2);
		
		//Ascending order
		list.stream().sorted().forEach(p -> System.out.println("Sorted List = " + p));
		
		//Revese Order
		list.stream().sorted(Comparator.reverseOrder()).forEach(p -> System.out.println("Decs order " + p));
		
		List<Employee> listNew = new ArrayList<Employee>();
		listNew.add(new Employee(1, "karthik", 1000));
		listNew.add(new Employee(2, "vinoth", 2000));
		listNew.add(new Employee(3, "hari", 500));
		listNew.add(new Employee(4, "mani", 200));
		
		//Salary Ascending
		//listNew.stream().sorted((o1,o2) -> o1.getSalary()-o2.getSalary()).forEach(System.out::println);
		
		//Salary Descending
		//listNew.stream().sorted((o1,o2) -> o2.getSalary()-o1.getSalary()).forEach(System.out::println);
		
		//Name Ascending
		//listNew.stream().sorted((o1,o2) -> o1.getName().compareTo(o2.getName())).forEach(System.out::println);
		
		//Name descending
		//listNew.stream().sorted((o1,o2) -> o2.getName().compareTo(o1.getName())).forEach(System.out::println);
		
		//listNew.stream().sorted(Comparator.comparing(empone->empone.getSalary())).forEach(System.out::println);
		
		listNew.stream().sorted(Comparator.comparing(empone->((Employee) empone).getSalary()).reversed()).forEach(System.out::println);

		
		//Sorting using reference
		//listNew.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::print);
		
		//Descending sorting using reference
		//listNew.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).forEach(System.out::print);

		
		
	}
	
}
