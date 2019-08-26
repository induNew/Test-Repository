package com.nonstatic;

public class Marker1 {
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
		System.out.println("color:"+this.color);
		System.out.println("name:"+this.name);
		System.out.println("length:"+this.length);
		System.out.println("price:"+this.price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marker1 m1=new Marker1();
		m1.initialize("Rorito","Blue",3.3,50);
		
		Marker1 m2=new Marker1();
		m2.initialize("cello","red",3.4,70);
	}

}