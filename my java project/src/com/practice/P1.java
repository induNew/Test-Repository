package com.practice;

public class P1 {
	int i;
	P1()
	{
		
	
	}

	P1(int i)
	{
	this.i=i;	
	}
	
	static void display(P1 a)
	{
		System.out.println("i="+a.i);
		
	}
	
	public static void main(String[] args) {
		P1 ob1=new P1(10);
		display(ob1);
		
	}
	
	
}
