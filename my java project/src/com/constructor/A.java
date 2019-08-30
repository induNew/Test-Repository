package com.constructor;

public class A {
	A()
	{
		System.out.println("From A()");
	}
	A(int i)
	{	
		this();
		System.out.println("From A(int)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=new A();//From A()
		System.out.println("----------");
		A ob2=new A(10);//From A()
						//From A(int)
		
		
	}

}
