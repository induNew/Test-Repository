package com.constructor;

public class C {
	C()
	{
		this(10);
		System.out.println("From B()");
	}
	C(int i)
	{	
		this();
		System.out.println("From B(int)");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob1=new C();//From A()
		System.out.println("----------");
		C ob2=new C(10);//From A()
						//From A(int)
		
		
	}

}