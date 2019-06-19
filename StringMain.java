package com.revature.java_practice;

public class StringMain {
	public static void main(String[] args) {
		int number = 10;
		String word = "esnohpla";
		//factorial(number);
		stringReversal(word);
		
		
		
	}

	private static void factorial(int number) {
		System.out.println(number);
	}
	private static void stringReversal(String reverseString) {
		StringMethods word = new StringMethods();
		
		word.reverse(reverseString);
	}
	public String reverse(String reverseString) {
		char[] splitting = reverseString.toCharArray();
		System.out.print(splitting[splitting.length]);
		char[] reducedString = new char [splitting.length - 1];
		for(int i = 0; i < reducedString.length; i++) {
			reducedString[i] = splitting[i];
		}
		String reduce = new String(reducedString);
		
		return reverse(reduce);
		
		
		
		
	}

}
