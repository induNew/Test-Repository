package com.treeset;

import java.util.TreeSet;

public class TS2 {

	public static void main(String[] args) {
		

		TreeSet ts=new TreeSet();
		
		ts.add(10);
		ts.add(20);
	//	ts.add(null); null pointer exception
		ts.add(30);
		
		System.out.println(ts);
	}

}
