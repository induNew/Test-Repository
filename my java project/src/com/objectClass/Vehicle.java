package com.objectClass;

public class Vehicle {
	int  vno;
	String color;
	
	Vehicle()
	{
		
	}
	
	Vehicle(int vno,String color)
	{
		this.vno=vno;
		this.color=color;
		
	}
	public String toString()
	{
		return "vno is :"+vno+"\nvehicle color:"+color;
	}
	

}
