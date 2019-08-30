package com.inheritence;

public class Road {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car("red",45,"Benz");
		
		System.out.println("color:"+c1.color);
		System.out.println("vno:"+c1.vno);
		System.out.println("brand:"+c1.brand);
		
		
		
		
		Vehicle v1=new Vehicle("Black",65);
		System.out.println("color:"+v1.color+"\nvno:"+v1.vno);
		
	}

}
