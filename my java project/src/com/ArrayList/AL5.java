package com.ArrayList;

import java.util.ArrayList;

public class AL5 {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		
		ls.add(10);
		ls.add("suraj");
		ls.add(new AL("red",20.35));
		ls.add(new Employee("1234D",45000.25));
		ls.add(new Student("xyz123","12th"));
		
		
		
		
		System.out.println(ls);
		
		for(Object ob:ls)
		{
			System.out.println(ob);
		}
		System.out.println("________________________________");
		
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i));
		}
		
		
		System.out.println("_________________________________");
		
		System.out.println(ls.get(0));
		System.out.println(ls.get(1));
		System.out.println(ls.get(2));
		System.out.println(ls.get(3));
		System.out.println(ls.get(4));
		
		
		
		
		
		
	}

}
