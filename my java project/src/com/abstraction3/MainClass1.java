package com.abstraction3;

public class MainClass1 {

	public static void main(String[] args) {
		Employee e1=new Employee("Dinga",1000,1);
		System.out.println("Salary of "+ e1.name+e1.getSalary()+"and id is "+e1.id);
		e1.setSalary(2000);
		System.out.println("Salary of "+e1.name+"is set as "+e1.getSalary());

	}

}
