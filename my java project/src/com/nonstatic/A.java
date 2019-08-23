package com.nonstatic;

public class A {
	int i;
	void test()//called method
	{
		System.out.println("from test()");
		System.out.println(i);//10
		System.out.println("this :"+this);//A@100
		i=20;
		System.out.println(this.i);//20
		System.out.println("end of test");
	}

	public static void main(String[] args) //calling method
	{
		// TODO Auto-generated method stub
		System.out.println("From main");
		A ob=new A();
		ob.i=10;
		ob.test();
		//System.out.println(this);//CTE
		System.out.println("ob :"+ob);
		System.out.println("end main");
		
	}

}
