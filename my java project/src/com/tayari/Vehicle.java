package com.tayari;

public class Vehicle {

	String color;
	int vno;
	
	
	public Vehicle() {
		
	}
	public Vehicle(String color, int vno) {
	
		this.color=color;
		this.vno =vno;
	}
	@Override
	public String toString() {
		return " color=" + color + ", vno=" + vno ;
	}
	
	
}
