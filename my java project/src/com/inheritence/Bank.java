package com.inheritence;

public class Bank {

	public static void main(String[] args) {
		
		Home h1=new Home("Home",10.0,2,"banda");
		System.out.println("type:"+h1.type+"	roi:"+h1.roi+"	tennure:"+h1.tennure+"	place:"+h1.place);
		h1.interest(100);
		
		
		Loan L1=new Loan("car",5.0,2);
		System.out.println("\ntype:"+L1.type+"	roi:"+L1.roi+"		tennure:"+L1.tennure);
		L1.interest(200);
	}
		
}
