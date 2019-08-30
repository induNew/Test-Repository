package com.nonstatic;

public class Ns1 {
	
	{
		System.out.println("from iib 1");
	}

public static void main(String[]args)
{
	System.out.println("from main");
	Ns1 ob=new Ns1();
	System.out.println(new Ns1());
	
	

}
}