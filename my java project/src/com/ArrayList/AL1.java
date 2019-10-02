package com.ArrayList;

import java.util.ArrayList;

public class AL1 {

	public static void main(String[] args) {
	
		ArrayList ls=new ArrayList();
		
		System.out.println(ls.size());//0
		System.out.println(ls.isEmpty());
		
		ls.add(10);
		ls.add("aditi");
		System.out.println(ls);
		
		ls.add("suraj");
		ls.add(10.09);
		System.out.println(ls);
		
		
		ls.add(2,"ad1");

System.out.println(ls.set(2, "Vs1"));

System.out.println(ls.contains("suraj"));

System.out.println(ls);

System.out.println(ls.remove("aditi"));
System.out.println(ls);

Object ob=ls.get(1);

System.out.println(ob);
System.out.println(ls.remove(0));
System.out.println(ls);
ls.clear();
System.out.println(ls);






		
		
		
		
		
		
	}

}
