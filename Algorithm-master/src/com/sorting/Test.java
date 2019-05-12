package com.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Test {
	
	
	public static void main(String[] args) {
		
		try {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					for(int i=1000;i>0;i--);
					try {
						throw new MyException("Oops!");
					}catch(MyException e) {
						System.out.println("***************");
						System.out.println(e.getMessage());
					}
					
					
				}
			}).start();
		}catch(MyException e) {
			System.out.println("Inside elseee");
		}
	}
}

class MyException extends RuntimeException{
	public MyException(String msg) {
		super(msg);
	}
	
	
}

