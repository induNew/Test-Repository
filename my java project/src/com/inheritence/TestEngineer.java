package com.inheritence;

public class TestEngineer extends Employee {
	String tool;
	void WriteScript()
	{
		
	}
	
	TestEngineer()
	{
		
	}
	
	TestEngineer(String name,double salery,String tool)
	{
		super(name,salery);
		this.tool=tool;
	}
	

}
