package com.projectinterview;

import java.util.ArrayList;

public class  AL5 {
	
	
	

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		
		ls.add(10);
		ls.add("hello");
		ls.add(new Bike("red",25.25));
		
		Bike b=new Bike("Blue",25.20);
		ls.add(b);
		
		
		for(int i=0;i<ls.size();i++)
		{
			 Object ob=ls.get(i);
			 
		
		
		if(ob instanceof Integer)
		{
			Integer i1=(Integer)ob;
			int i2=i1;
			System.out.println(i2+10);
		}
		
		if(ob instanceof Bike) {
			Bike bike=(Bike)ob;
			bike.color="black";
			System.out.println(bike.color);
			System.out.println(ls);
		}
	}}
}
			
	