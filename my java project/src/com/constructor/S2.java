package com.constructor;

public class S2 {
	int i;
	S2()
	{
		
	}
	
	S2(int i)
	{
		this.i=i;
	}
	
	void display(S2 ob)
	{
		System.out.println("i="+this.i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S2 ob1=new S2(10);
		ob1.display(ob1);
		S2 ob2=new S2(20);
		ob2.display(ob2);
		S2 ob3=new S2(30);
		ob3.display(ob3);
		
	}

}