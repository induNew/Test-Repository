package com.hashSetPrograms;

import java.util.HashSet;

public class HS1 {
	
	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add("hello");
		hs.add(10.9);
		
		System.out.println(hs);//heterogeneous allowed
				hs.add(null);//null is allowed
				System.out.println(hs);//[20, 10.9, 10, hello] order of insertion not maintained
				hs.add(10);//duplicates denied
				
				System.out.println(hs.add(10));
				
				System.out.println(hs);//[null, 20, 10.9, 10, hello]
				
				System.out.println(hs.size());
				
				hs.remove(10.9);
				System.out.println(hs);
				
				hs.removeAll(hs);
				System.out.println(hs);
				
				System.out.println(hs.contains(10));
	}

}
