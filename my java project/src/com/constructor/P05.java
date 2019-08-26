package com.constructor;

public class P05 {

	P05()
	{
	System.out.println("Hey I am constructor 1");
	}
	P05(char i)
	{
		System.out.println("Hey I am constructor 2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P05 ob=new P05();
		System.out.println("_-_-_-_");
		P05 ob2=new P05('a');
	}

}
