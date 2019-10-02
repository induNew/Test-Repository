package com.objectClass;

public class A1 {
	int i=10;
	public String toString()
	{
		return ""+i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		A1 ob1=new A1();
		System.out.println(ob1);
		
		A1 ob2=new A1();
		ob2.i=20;
		System.out.println(ob2);
	}
}