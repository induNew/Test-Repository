package com.exceptions;

public class UC3 {
	public static void main(String[] args) {
		
		System.out.println(1);
		int []a=new int[3];
		System.out.println(2);
		System.out.println(a[1]);
		System.out.println(3);
		System.out.println(a[2]);
		System.out.println(4);
		try {
			System.out.println(a[3]);
		}
		
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("caught"+e);
		}
		System.out.println(5);
		
		
	}

}
