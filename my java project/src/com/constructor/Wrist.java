package com.constructor;

public class Wrist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watch w1=new Watch("Analog",500);
		Watch w2=new Watch("digital",400);
		Watch w3=new Watch("Chronical",400);
		System.out.println("type:"+w1.type+"price:"+w1.price);
		System.out.println("type:"+w2.type+"price:"+w2.price);
		System.out.println("type:"+w3.type+"price:"+w3.price);
	}

}
