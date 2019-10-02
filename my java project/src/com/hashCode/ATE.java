package com.hashCode;


public class ATE extends Emp{
	double salary;
	String tool;
	ATE()
	{
		
	}
	ATE(String name,int id,double salary,String tool)
	
	{
		super(name,id);
		this.salary=salary;
		this.tool=tool;
		
	}
	
	
	public boolean equals(Object ob)
	{
		ATE temp=(ATE)ob;
		return super.equals(temp) && this.salary==temp.salary && this.tool.equals(temp.tool) ;
		
	}
	
	public int hashCode()
	
	{
		this.nameR=this.tool;
		int Result=Integer.parseInt(nameR);
		System.out.println(Result);
		int a=(int)this.salary;
		int hc=Result+a+super.hashCode();
		return hc;
	}

}
