package com.treeset;

import java.util.TreeSet;

public class TS7 {

	public static void main(String[] args) {
		
		TreeSet<Employee>employee=new TreeSet<Employee>();
		employee.add(new Employee("ABC",1));
		employee.add(new Employee("XYZ",2));
		employee.add(new Employee("LMN",3));
		System.out.println(employee);
	}

}
