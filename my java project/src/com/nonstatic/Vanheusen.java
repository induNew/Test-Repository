package com.nonstatic;

public class Vanheusen {
	String color;
	int size;
	String productCode;
	static int count;
	
	
	{
		count++;
		productCode="VAN"+count;
	}
	
	Vanheusen()
	{
		

	}
	
	Vanheusen(String color,int size)
	{
		this.color=color;
		this.size=size;
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vanheusen ob1=new Vanheusen();
		System.out.println("product code for shirt "+count+"is"+ob1.productCode+"   color:"+ob1.color+" size:"+ob1.size);
		Vanheusen ob2=new Vanheusen("red",42);
		System.out.println("product code for shirt "+count+"is"+ob2.productCode+"   color:"+ob2.color+" size:"+ob2.size);
	}
}
