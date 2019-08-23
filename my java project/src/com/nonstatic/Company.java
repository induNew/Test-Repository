package com.nonstatic;

public class Company {

		public static void main(String[]args)
		{
			Emp e1=new Emp();
			System.out.println("Employee name :"+e1.name+"Employee id:"+e1.id);
			
			Emp e2=new Emp();
			System.out.println("Employee name :"+e2.name+"Employee id:"+e2.id);
			e2.name="chiku";
			e2.id=1;
			System.out.println("Employee name :"+e2.name+"Employee id:"+e2.id);
			
			Emp e3=new Emp();
			e3.name="chikki";
			e3.id=2;
			System.out.println("Employee name :"+e3.name+"Employee id:"+e3.id);
		}
	}

