//wap to count the no of object of a class
package com.nonstatic;

public class Employee1 {
	String id;
	static int count;
	String name;
	
	{
		count++;
		id="TY"+count;
	}
	
	Employee1()
	{
		System.out.println("from Employee");
	}
	
	
	Employee1(String name)
	{
		this.name=name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 ob1=new Employee1();
		System.out.println(ob1.name+"has "+ob1.id+"as id");
		Employee1 ob2=new Employee1("sara");
		System.out.println(ob2.name+"has "+ob2.id+"as id");
		
	}
}
