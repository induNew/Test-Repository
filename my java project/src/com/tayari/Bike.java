package com.tayari;

public class Bike extends Vehicle{
	
	String name;
	double milege;
	
	
	public Bike() {
		// TODO Auto-generated constructor stub
	}
	public Bike(String color,int vno,String name, double milege) {
		super(color,vno);
		this.name = name;
		this.milege = milege;
	}
	@Override
	public String toString() {
		return super.toString()+" name=" + name + ", milege=" + milege + "";
	}

	
	

}
