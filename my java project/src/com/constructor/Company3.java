package com.constructor;

public class Company3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Laptop c1=new Laptop("dell",4,"i3");
		Laptop c2=new Laptop("hp",4,"i4");
		Laptop c3=new Laptop("acer",2,"i5");
		System.out.println("brand:"+c1.brand+"        ram:"+c1.ram+"       processor:"+c1.processor);
		System.out.println("brand:"+c2.brand+"        ram:"+c2.ram+"       processor:"+c2.processor);
		System.out.println("brand:"+c3.brand+"        ram:"+c3.ram+"       processor:"+c3.processor);
	}
}