package com.pac1;

public class P3 extends P1{

	public static void main(String[] args) {
		System.out.println(P3.j);
		System.out.println(P3.i);//cte because i is private member of P1 hence not inherits
		
		P3 ob=new P3();
		System.out.println(ob.x);//cte because x is a non static private member of the superclass P1 and cannot be inherited

	}

}
