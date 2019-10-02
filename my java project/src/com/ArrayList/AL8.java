package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class AL8 {

	public static void main(String[] args) {
	
		ArrayList<Integer>ls=new ArrayList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		
		//Accesing the arraylist using iterator(),hasNext(),next()
		
		Iterator<Integer> t=ls.iterator();
		
		while(t.hasNext())
		{
		Object 	i=t.next();
		System.out.println(i);
		}
		

	}

}


