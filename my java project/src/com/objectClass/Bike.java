package com.objectClass;

public class Bike extends Vehicle {
	
	double mileage;
	String name;
	public Bike() {
		
		
	}
	public Bike(int vno, String color ,double mileage,String name)
	{
		super(vno,color);
		this.mileage=mileage;
		this.name=name;
		
	}
	
	public String toString()
	{
		System.out.println("____________________________________");
		return super.toString()+"\nmileage is:"+mileage+"\nname is "+name;
	}
	
	

}
