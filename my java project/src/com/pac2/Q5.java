package com.pac2;

import com.pac1.Q1;

public class Q5 extends Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Q5.i);//i is not inherited bcz it hav default acc specifier
		Q5 ob=new Q5();
		System.out.println(ob.j);//j is not inherited in object of Q5 subclass
	}

}
//static or non static members of superclass are not inherited outside
//the package if they have default acc specifiers