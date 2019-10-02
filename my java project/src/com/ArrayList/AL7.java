package com.ArrayList;

import java.util.ArrayList;

public class AL7 {

	public static void main(String[] args) {
		
		ArrayList<Boolean>ls=new ArrayList<>();
		
		ls.add(10==10);
		ls.add(30>20);
		ls.add(30>20||20<10);
//		ls.add("hello");
//		ls.add('a');//we can not store any other value than integer
System.out.println(ls);
	}

}
