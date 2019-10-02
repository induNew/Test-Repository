package com.hashCode;


public class ATE1 extends Emp1{
	double salary;
	String tool;
	ATE1()
	{
		
	}
	ATE1(String name,int id,double salary,String tool)
	
	{
		super(name,id);
		this.salary=salary;
		this.tool=tool;
		
	}
	
	
	public boolean equals(Object ob)
	{
		ATE1 temp=(ATE1)ob;
		return super.equals(temp) && this.salary==temp.salary && this.tool.equals(temp.tool) ;
		
	}
	
	public int hashCode()
	{
		int hc=0;
		int a=(int)this.salary;
		hc=a+tool.hashCode()+super.hashCode();
		return hc;
	}

}
