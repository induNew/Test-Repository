package com.projectinterview;

public class Manager extends Employee1{
	String domain;
	
	public Manager() {
		
	}

	public Manager(int id,double salary,String damain) 
	{
		super(id,salary);
		this.domain=domain;
	}


	public String toString() {
		return super.toString()+"domain=" +domain;
	}
	
	

}
