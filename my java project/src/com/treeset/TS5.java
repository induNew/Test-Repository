package com.treeset;

import java.util.TreeSet;

public class TS5 {

	public static void main(String[] args) {
		

		TreeSet ts=new TreeSet();
		
		ts.add(true);
		ts.add(10>=12);
		//ts.add(40);//CCE
		
		
		System.out.println(ts);//order of insertion not maintained but output order predictable as sorted 
	}

}
