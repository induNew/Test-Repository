package com.practice;

public class Employee {
	String name;
	int id;
	private double Salary;
	
	Employee(){
		
	}
	Employee(String name,int id,double Salary)
	{
		this.name=name;
		this.id=id;
		this.Salary=Salary;
	}
	
	public double getSalary() {
		return Salary;
	}
	
	public void setSalary(double Salary)
	{
		if(Salary>this.Salary) {
			this.Salary=Salary;
			System.out.println("You have got a successful hike");
			System.out.println("Current Salary is "+this.Salary);
			}
		
			else
			{
				System.out.println("Enter an incremented Salary");
			}
		
	}

}
