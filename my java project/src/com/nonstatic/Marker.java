package com.nonstatic;

public class Marker {
	String color;
	String name;
	double length;
	int price;
	
	
	void initialize(String name,String color,double length,int price)
	{
		this.color=color;
		this.name=name;
		this.length=length;
		this.price=price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marker m1=new Marker();
		m1.initialize("Rorito","Blue",3.3,50);
		System.out.println("color:"+m1.color);
		System.out.println("name:"+m1.name);
		System.out.println("length:"+m1.length);
		System.out.println("price:"+m1.price);
	}

}
