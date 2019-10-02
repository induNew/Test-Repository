package com.recursion;

public class P1 {
	
	static void printNumber(int n)
	{
		if(n==4)
		return;
	
	System.out.println(n);
	printNumber(++n);
	System.out.println(n);
	}

	

	public static void main(String[] args) {
		System.out.println("main begins");
		printNumber(0);
		System.out.println("main ends");
		

	}

}
