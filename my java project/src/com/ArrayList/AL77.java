package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AL77 {

	public static void main(String[] args) {
	
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add("Hello");
		
		//Accesing the arraylist using iterator(),hasNext(),next()
		
		Iterator t=ls.iterator();
		
		while(t.hasNext())
		{
		Object 	i=t.next();
		System.out.println(i);
		}
		

	}

}


