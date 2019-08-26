package com.constructor;

public class P1 {
	P1()
	{
		System.out.println("from constructor of P1");
		
	}
	public static void main(String[]args)
	{
		System.out.println("from main");
		P1 ob=new P1();
		System.out.println(new P1());
		
	}
	
}
