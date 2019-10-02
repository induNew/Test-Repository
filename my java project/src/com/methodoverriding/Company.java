package com.methodoverriding;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee();
		e1.works();
		
		Developer d1=new Developer();
		d1.works();
		
		Tester t1=new Tester();
		t1.works();
		

	}

}
