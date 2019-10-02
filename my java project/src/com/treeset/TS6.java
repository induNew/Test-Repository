package com.treeset;

import java.util.TreeSet;

public class TS6 {

	public static void main(String[] args) {
		

		TreeSet<Boolean>ts=new TreeSet<>();
		
		ts.add(true);
		ts.add(10>=12);
		//ts.add(40);//CTE
		
		
		System.out.println(ts);//order of insertion not maintained but output order predictable as sorted 
	}

}
