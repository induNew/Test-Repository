package com.constructor;

public class S1 {
	int i;
	S1()
	{
		
	}
	
	S1(int i)
	{
		this.i=i;
	}
	
	static void display(S1 ob)
	{
		System.out.println("i="+ob.i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S1 ob1=new S1(10);
		S1.display(ob1);
		S1 ob2=new S1(20);
		S1.display(ob2);
		S1 ob3=new S1(30);
		S1.display(ob3);
		
	}

}
