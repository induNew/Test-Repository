package com.practice;

public class MainClass1 {

	public static void main(String[] args) {
		Employee E1=new Employee("aditi",2,25000);
		System.out.println("Employee "+E1.name+" having employee id "+E1.id+" Salary "+E1.getSalary());
		E1.setSalary(2000);
//		System.out.println("Employee "+E1.name+" having employee id "+E1.id+" Salary "+E1.getSalary());
		
	}

}
