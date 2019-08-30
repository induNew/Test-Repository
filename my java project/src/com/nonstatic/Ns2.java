package com.nonstatic;

public class Ns2 {
	
	{
		
	System.out.println("from iib-1");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("from main");
		Ns2 ob=new Ns2();
		Ns2 ob2=new Ns2();
		System.out.println("main ends");

	}
	{
		System.out.println("from iib-2");
	}

}
