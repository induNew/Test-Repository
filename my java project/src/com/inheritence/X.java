package com.inheritence;

public class X {
	static int i=10;

	static
	{
		System.out.println(i);
		System.out.println("sib of x");
	}
	
	public static void main(String[] args) {
		System.out.println("main of X");
		
	}
}