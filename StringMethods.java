package com.revature.java_practice;

public class StringMethods {
	
	
	

	public String reverse(String reverseString) {
		char[] splitting = reverseString.toCharArray();
		System.out.print(splitting[splitting.length]);
		char[] reducedString = new char [splitting.length - 1];
		for(int i = 0; i < reducedString.length; i++) {
			reducedString[i] = splitting[i];
		}
		String reduce = new String(reducedString);
		
		reverse(reduce);
		
		return reduce;
		
		
	}

	

}

