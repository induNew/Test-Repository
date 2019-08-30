package com.constructor;

public class B {
	B()
	{
		this(10);
		System.out.println("From B()");
	}
	B(int i)
	{	
		
		System.out.println("From B(int)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob1=new B();//From A()
		System.out.println("----------");
		B ob2=new B(10);//From A()
						//From A(int)
		
		
	}

}