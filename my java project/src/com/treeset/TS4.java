package com.treeset;

import java.util.TreeSet;

public class TS4 {

	public static void main(String[] args) {
		

		TreeSet ts=new TreeSet();
		
		ts.add('a');
	//	ts.add(20);//here CCE
		ts.add(40);
		ts.add(30);
		
		System.out.println(ts); 
	}

}
