package com.inheritence;

public class Road2 {
	
	
	static void display(Vehical v)
	{
		System.out.println("color is :" +v.color);
		if(v instanceof TwoWheeler)
			System.out.println("Name is "+((TwoWheeler)v).name);
		if(v instanceof Bike)
			System.out.println("Mileagage is "+((Bike)v).mileage);
		System.out.println("___________________");
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b1=new Bike("red","CBZ",50);
		display(b1);
		TwoWheeler t1=new TwoWheeler("Black","HD");
		display(t1);
		Vehical v1=new Vehical("Green");
		display(v1);
		Bike b2=new Bike("Orange","KTM",25);
		display(b2);
		
		
		
	}

}
