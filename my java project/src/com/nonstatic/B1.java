package com.nonstatic;

public class B1 {
	int i;
	
	public B1 initialize(int i)
	{
		this.i=i;
		return this;
		
	}
	
	public static B1 createObject()
	{
		return new B1();
	}

	
	void display()
	{
		System.out.println("i:"+this.i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1.createObject().initialize(10).display();  //B1 ob=B.createObject()//

	}

}
