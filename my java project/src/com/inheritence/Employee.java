package com.inheritence;

public class Employee {
	String id;
	String name;
	double salery;
	static int count;
	
	void work()
	{
		System.out.println("Employee is working");
	}
	Employee()
	{
		
	}

	
	Employee(String name,double salery)
	{
		
		
		this.name=name;
		this.salery=salery;
		count++;
		id="TestEngineer"+count;
		
	}
}
