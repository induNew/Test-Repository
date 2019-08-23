package com.nonstatic;

public class Demo {
	String colour;
	String name;
	double length;
	int price;
	
	
	void initialize(String a,String b,double c,int d)
	{
		colour=a;
		name=b;
		length=c;
		price=d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo ob=new Demo();
		ob.initialize("Rorito","Blue",3.3,50);
				
	}

}
