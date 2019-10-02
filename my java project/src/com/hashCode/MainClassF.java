package com.hashCode;

public class MainClassF {

	public static void main(String[] args) {
		Emp1 ob1=new Emp1("aditi",1);
		Emp1 ob2=new Emp1("aditi",1);
		
		System.out.println(ob1.equals(ob2));
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
		
		System.out.println("+++++++++++++++++");
		ATE1 ob3=new ATE1("suraj",1,20000,"QTP");
		ATE1 ob4=new ATE1("suraj",1,20000,"selenium");
		
		System.out.println(ob3.equals(ob4));
		System.out.println(ob3.hashCode());
		System.out.println(ob4.hashCode());
		
		
		

	}

}
