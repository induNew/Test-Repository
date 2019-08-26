package com.constructor;

public class Marker2 {
	String color;
	double length;
	Marker2(String color,double length)
	{
		this.color=color;
		this.length=length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marker2 m1=new Marker2("Black",3.5);
		System.out.println("color:"+m1.color+"    length:"+m1.length);
		
		
	}

}
