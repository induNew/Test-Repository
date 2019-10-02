package com.projectinterview;

import java.util.ArrayList;

public class Company {

	public static void main(String[] args) {
		ArrayList<Employee1>employee=new ArrayList<>();
		employee.add(new Employee1(1,12.0));
		employee.add(new Employee1(2,42.0));
		
		new Manager(3,49,"finance"));
		new Manager(4,47,"hr"));
		
		System.out.println(employee);
		

	}

}
