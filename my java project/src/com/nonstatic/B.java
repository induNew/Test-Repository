package com.nonstatic;

public class B {
	int i;//non static global variable
	void test()
	{
		int i=30;
		System.out.println(i);
		System.out.println(this.i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B ob1=new B();
		ob1.test();
		B ob2=new B();
		ob2.i=20;
		ob2.test();
	}

}
