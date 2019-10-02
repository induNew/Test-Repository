package com.hashCode;

public class MainClass1 {

	public static void main(String[] args) throws NumberFormatException {
		Emp ob1=new Emp("aditi",1);
		Emp ob2=new Emp("aditi",1);
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		
		System.out.println("+++++++++++++++++");
		ATE ob3=new ATE("suraj",1,20000,"QTP");
		ATE ob4=new ATE("suraj",1,20000,"selenium");
		
		System.out.println(ob3.equals(ob4));
		System.out.println(ob3.hashCode());
		System.out.println(ob4.hashCode());
		
		
		

	}

}
