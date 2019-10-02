package com.sort;

import java.util.ArrayList;

import java.util.Collections;

public class Sort {

	public static void main(String[] args) {
		 ArrayList<Integer>ls=new ArrayList<>();
		 ls.add(10);
		 ls.add(25);
		 ls.add(15);
		 ls.add(14);
		 
		 System.out.println("Before sorting");
		 System.out.println(ls);
		 
		 System.out.println("After sorting");
		Collections.sort(ls);
		System.out.println(ls);

	}

}
