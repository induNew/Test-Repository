package com.ArrayList;



public class Student {
	
	String rollNo;
	String std;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String rollNo, String std) {
		
		this.rollNo = rollNo;
		this.std = std;
	}


	public String toString()
	{
		return "rollNo: "+rollNo+"\nstd: "+std;
	}

}
