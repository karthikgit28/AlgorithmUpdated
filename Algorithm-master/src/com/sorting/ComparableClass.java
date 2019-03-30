package com.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableClass {
	
	public static void main(String[] args) {
		
		User user = new User();
		user.setUserName("karthik");
		user.setPassword("password");
		
		User user2 = new User();
		user2.setUserName("test");
		user2.setPassword("password");
		
		List<User> list = new ArrayList<User>();
		
		list.add(user2);
		list.add(user);
		
		Collections.sort(list);
		
		System.out.println("SortedList = " + list.toString());
	}
	

}


class User implements Comparable<User>{
	
	private String userName;
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	
	@Override
	public int compareTo(User user) {
		//Positive number : THIS particular object is greater than we are comparing to - Swapping happens
		// 0 : THIS particular object is equal to we are comparing to
		//Negative : THIS particular object is lesser than we are comparing to
		
		return this.userName.compareTo(user.getUserName());
	}
	
}
