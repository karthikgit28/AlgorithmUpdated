package com.algorithm.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ArrayLogic {

	public static void main(String[] args) {

		//check equality of array
		String s1[] = {"a","b","c"};
		String s2[]= {"a","c","b"};

		Arrays.sort(s1);
		Arrays.sort(s2);

		System.out.println(Arrays.equals(s1, s2));

		//check multi dimesional array
		/**
		 * If you are checking multidimensional arrays for equality, then use deepEquals() method of Arrays class instead of equals() method. Because, deepEquals() performs deep comparison of both the arrays.
		 */
		String[][] s11 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };

		String[][] s22 = { {"java", "swings", "j2ee" }, { "struts", "jsp", "hibernate"} };

		System.out.println(Arrays.deepEquals(s11, s22)); 


		//Check duplicate in array
		int a[] = {1,4,6,3,1,4};
		Map<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int a1 : a) {
			if(map.containsKey(a1)) {
				map.put(a1, map.get(a1)+1);
			}else{
				map.put(a1, 1);
			}
		}
		Set<Integer> finalCount = map.keySet();
		for(Integer a11 : finalCount) {
			if(map.get(a11) > 1) {
				System.out.println(a11 + " Duplciates = " +map.get(a11));
			}

		}


		//count sum of digits
		int a23 = 12344;
		int copy = a23;
		int sum = 0;
		while(copy != 0) {
			int lastDigit = copy%10;
			sum = sum + lastDigit;
			copy = copy/10;
		}
		System.out.println("Sum = " + sum);


		//Find second largest of array
		int a34[] = {1,4,6,3,6,9};
		int firstlargest,secondLargest;

		if(a34[0] > a34[1]) {
			firstlargest = a34[0];
			secondLargest = a34[1];
		}else {
			firstlargest = a34[1];
			secondLargest = a34[0];
		}
		for(int i=2;i<a34.length;i++) {
			if(a34[i] > firstlargest) {
				secondLargest = firstlargest;
				firstlargest = a34[i];
			}else if(a34[i] < firstlargest && a34[i] > secondLargest){
				secondLargest = a34[i];
			}
		}
		System.out.println("second largest = " + secondLargest);


		//13) How to find largest number less than a given number and without a given digit?
		int number = 145;
		int notToBeIncluded = 4;

		char c = Integer.toString(notToBeIncluded).charAt(0);
		for(int i=number; i>0 ;i--) {
			if(Integer.toString(i).indexOf(c) == -1) {
				System.out.println("Previous number = " + i);
				//return;
			}
		}

		// 14) How to find all pairs of elements in an array whose sum is equal to given number?
		int sumToBe = 10;
		int arr[] = {4, 6, 5, -10, 8, 5, 20};

		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] + arr[j] == sumToBe) {
					System.out.println("Pair = " + arr[i] +"," +arr[j]);
				}
			}

		}


		//Remove duplicate from arraylist
		ArrayList<String> list = new ArrayList<String>();
		list.add("karthik");
		list.add("kamal");
		list.add("kiran");
		list.add("karthik");

		System.out.println("With duplicates = " + list);

		//HashSet wont preserve insertion order
		//		 HashSet<String> newSet = new HashSet<String>(list);
		//		 ArrayList<String> modifiedList = new ArrayList<String>(newSet);
		//		 System.out.println("Without duplicates = " + modifiedList);

		//Linkedhashset preserves insertion order
		LinkedHashSet<String> modified = new LinkedHashSet<String>(list);
		ArrayList<String> modifiedNewList = new ArrayList<String>(modified);
		System.out.println("Without duplicates & insertion order = " + modifiedNewList);


		//Find duplicates elements in 2 array
		String[] s111 = {"ONE", "TWO", "THREE", "FOUR", "FIVE", "FOUR"};
		String[] s222 = {"THREE", "FOUR", "FIVE", "SIX", "SEVEN", "FOUR"};
		HashSet<String> newSet = new HashSet<String>();
		for(int i=0; i <s111.length;i++) {
			for(int j=0;j<s222.length;j++) {
				if(s111[i] == s222[j]) {
					newSet.add(s111[i]);
				}
			}
		}
		System.out.println("New elements = " + newSet);


		//Find duplicates for int array
		Integer[] i1 = {1, 2, 3, 4, 5, 4};
		Integer[] i2 = {3, 4, 5, 6, 7, 4};
		HashSet<Integer> set1 = new HashSet<>(Arrays.asList(i1));
		HashSet<Integer> set2 = new HashSet<>(Arrays.asList(i2));
		set1.retainAll(set2);
		System.out.println("Using retain all = " + set1);
		
		
		//To find leader if elements in right are smaller than it
		int anew[] = {1,7,4,3,5};
		int max = anew[anew.length-1];
		System.out.println("Max element "+ max);
		for(int i=anew.length-2;i>=0;i--) {
			if(anew[i] > max) {
				System.out.println("Max element "+ anew[i]);
				max = anew[i];
			}
		}
		


	}



}
