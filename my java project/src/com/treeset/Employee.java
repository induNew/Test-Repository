package com.treeset;

public class Employee implements Comparable<Employee> {
	String name;
	int id;
	
	
	
	
	Employee(){}
	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
	

	}
	
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
	public int compareTo(Employee emp) {
		
		return this.name.compareTo(emp.name);
	}
	
	
	

}
