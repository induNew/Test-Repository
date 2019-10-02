package com.pac2;

import com.pac1.R1;

public class R4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(R1.i);//protected member is not visible outsie the pacakge in diff class

		
		R1 ob=new R1();
		System.out.println(ob.j);//protected member is not visible outsie the pacakge in diff class
	}

}
