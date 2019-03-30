package com.algorithm.program;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringLogic {

	public static void main(String[] args) {

		/**“\\s+” Vs “\\s” :1) Both of these strings, when passed to replaceAll() method, produce the same result with almost same performance. But, when the number of consecutive spaces increases, “\\s+” is slightly faster than “\\s”. Because, it replaces set of consecutive multiple spaces 
		with the replacement string at a time rather than replacing one by one.
		2) trim() method trims the given string i.e it removes the white spaces at the beginning and at the end of a string, not between the words.**/
		String test ="I Love Java";
		System.out.println("New without space = " + test.replaceAll("\\s+", ""));



		//Duplicate character & their count
		String testDup = "karthik";
		Map<Character, Integer> count = new HashMap<Character, Integer>();

		for(int i=0; i<testDup.length();i++) {
			char a = testDup.charAt(i);
			if(count.containsKey(a)) {
				int newCount = count.get(a);
				count.put(a, ++newCount);
			}else {
				count.put(a, 1);
			}
		}
		Set<Character> finalCount = count.keySet();

		for(Character c : finalCount) {
			if(count.get(c) > 1) {
				System.out.println(c + " Duplicates = " + count.get(c));
			}
		}



		//check anagram of string
		String s11 = "Mother In Law";
		String s22 = "Hitler Woman";
		
		char s1[] = s11.replaceAll("\\s+", "").toUpperCase().toCharArray();
		char s2[] = s22.replaceAll("\\s+", "").toUpperCase().toCharArray();
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		System.out.println("ISAnargam = " + Arrays.equals(s1, s2));

	}

}
