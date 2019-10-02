package com.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

import com.exceptions.SalaryException;

public class Compony {
	
	
	public static void main(String[] args) {
		ArrayList<Emp>emp=new ArrayList<>();
		
		Emp e1=new Emp(1,12333.0);
		emp.add(e1);
		
		
		Manager m1=new Manager(2,23000.98,"Finance");
		emp.add(m1);
		
		System.out.println(emp);
		
		//accessing individual objects of the ArrayList using get()
		for(int i=0;i<emp.size();i++)
		{
			
			Emp emp1=emp.get(i);
			System.out.println(emp1);
			if(emp1 instanceof Manager)
			{
			Manager manager=(Manager)emp1;
			System.out.println(manager);
			System.out.println();
			
			
			}
			System.out.println("*********************");
		}
		
		//Accessing individual objects of the Array using for each
		
		for(Emp emp1:emp)
		{
			
			if(emp1 instanceof Manager)
			{
			Manager manager=(Manager)emp1;
			System.out.println(manager);
			
		}
		
		}

		
		Iterator<Emp>e=emp.iterator();
		
		while(e.hasNext())
		{
			Emp emp1=e.next();
			System.out.println("id"+e1.id+"salary"+e1.Salary);
			if()
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	}
