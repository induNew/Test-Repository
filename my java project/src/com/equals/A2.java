package com.equals;

public class A2 extends A1{
	char ch;
	A2(String s,int j,char ch)
	{
		super(s,j);
		
		this.ch=ch;
	}
	

	public static void main(String[] args) {
		A1 ob1=new A1("ABC",10);
		A1 ob2=new A1("ABC",10);
		System.out.println(ob1.equals(ob2));
		

	}

}
