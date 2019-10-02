package com.equals;

public class A1 {
	String s;
	int j;
	
	
	A1(){
		
	}
	
	public A1(String s, int j) {

		this.s = s;
		this.j = j;
	}

	public boolean equals(Object ob)
	{
		A1 temp=(A1)ob;
		return this.equals(temp);
		
	}

}
