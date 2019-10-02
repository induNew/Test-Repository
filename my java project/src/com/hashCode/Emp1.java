package com.hashCode;

public class Emp1 {
	String name;
	int id;
	String nameR;
	
	Emp1()
	{
		
	}
	Emp1(String name,int id){
		this.name=name;
		this.id=id;
	
	}
	
	public boolean equals(Object ob)
	{
		Emp1 temp=(Emp1)ob;
		return this.name.equals(temp.name) && this.id==temp.id;
		
	}
	
	
	public int hashCode() {
		int hc=0;
		hc=id+name.hashCode();
		return hc;
	}

}