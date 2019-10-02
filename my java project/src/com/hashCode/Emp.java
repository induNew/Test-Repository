package com.hashCode;

public class Emp {
	String name;
	int id;
	String nameR;
	
	Emp()
	{
		
	}
	Emp(String name,int id){
		this.name=name;
		this.id=id;
	
	}
	
	public boolean equals(Object ob)
	{
		Emp temp=(Emp)ob;
		return this.name.equals(temp.name) && this.id==temp.id;
		
	}
	
	
	public int hashCode() {
		this.nameR=this.name;
		int Result=Integer.parseInt(nameR);
		System.out.println(Result);
		return Result;
	}

}