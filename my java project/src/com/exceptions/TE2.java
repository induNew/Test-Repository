package com.exceptions;

import java.util.Scanner;

public class TE2 {
	int salary;
	void readSalary()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the new salary");
		int salary=sc.nextInt();
		if(salary<this.salary)
		{
			System.out.println("Invalid Salary");
			try
			{
			throw new SalaryException();
			}
			
			catch(ArithmeticException e) {
				e.printStackTrace();
				readSalary();
				
			}
		}	
		else 
			this.salary=salary;
	}
		
		public TE2(int salary)
		{
			this.salary=salary;
		} 
		

	
	public static void main(String[] args) {
		TE2 e=new TE2(100);
		System.out.println("Employee salary is :"+e.salary);
		e.readSalary();
		System.out.println("Raised slary is "+e.salary);
		
	}

}
