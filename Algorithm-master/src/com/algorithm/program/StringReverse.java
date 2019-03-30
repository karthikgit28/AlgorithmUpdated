package com.algorithm.program;

public class StringReverse {
	
	public static void main(String[] args) {
		
		//Using String Builder
		StringBuilder builder = new StringBuilder("Karthik");
		System.out.println("Reversed = " + builder.reverse());
		
		
		
		//Using Iterative Method
		String test = "Karthik";
		char a[] = test.toCharArray();
		System.out.println(test.length());
		for(int i = test.length() - 1; i >=0 ; i--) {
			System.out.println("Iterative Reversed = " + a[i]);
		}
		
	}

}
