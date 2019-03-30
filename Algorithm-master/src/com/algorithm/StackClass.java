package com.algorithm;

import java.util.Stack;

public class StackClass {
	
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<Integer>();
		
		for(int i=0;i<=10;i++) {
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			System.out.println("stack remove " + stack.pop());
		}
		
		System.out.println("elements = " + stack);
		
	}

}
