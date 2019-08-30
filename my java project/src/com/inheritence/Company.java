package com.inheritence;

public class Company {

	public static void main(String[] args) {
		
		TestEngineer t1=new TestEngineer("suraj",20000.0,"selenium");
		System.out.println(" "+t1.id+" is writting a script using  "+t1.tool);
		
		
		TestEngineer t2=new TestEngineer("aditi",190000.0,"QTP");
		System.out.println(" "+t2.id+" is writting a script using  "+t2.tool);
		
		
		
		
		
		
		Employee E1=new Employee("Saurabh",25000.0);
		System.out.println(" "+E1.id+" is writting a script and takes a salery "+E1.salery);
		
		Employee E2=new Employee("Shriya",20000.0);
		System.out.println(" "+E2.id+" is writting a script and takes a salery "+E2.salery);
	}

}
