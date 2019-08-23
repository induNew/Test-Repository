package com.nonstatic;

public class School {

	public static void main(String[]args)
	{
		Student s1=new Student();
		System.out.println("Student name :"+s1.name+"Student marks:"+s1.marks);
		
		Student s2=new Student();
		System.out.println("Student name :"+s2.name+"Student marks:"+s2.marks);
		s2.name="chiku";
		s2.marks=20;
		System.out.println("Student name :"+s2.name+"Student marks:"+s2.marks);
		
		
		Student s3=new Student();
		s3.name="chikki";
		s3.marks=30;
		System.out.println("Student name :"+s3.name+"Student marks:"+s3.marks);
		
	}
}

