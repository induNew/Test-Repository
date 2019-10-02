package com.ArrayList;

public class Employee {
	
	String id;
	double salary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(String id, double salary) {
		
		this.id = id;
		this.salary = salary;
	}
	
	public String toString()
	{
		return "id: "+id+"\nsalary: "+salary;
	}

}
