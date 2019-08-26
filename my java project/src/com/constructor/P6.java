package com.constructor;

public class P6 {
	int j;
	static int i;
	P6() //Constructor is a non static context
	{
		i=10;//accessing static member directly
		System.out.println(P6.i);//accessing static member with a class name as a reference
		System.out.println(j);//accessing non static number directly
		j=20;
		System.out.println(this.i);//accessing non static number using this
		System.out.println(this);//p6@100
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P6 ob=new P6();
	}

}
