
package com.abstraction3;

public class Voter {
	//public String name;
	private String id;
	private int age;
	
	public int getage()
	{
		return age;
	}
	public void setage(int age)
	{
		if(age>=18)
		
			this.age=age;
		
		else
		System.out.println("You are not eligible to vote");
		
	}
			public String getid()
			{
				return id;
			}
			
			public void setid(String id)
			{
				this.id=id;
			}
			
			Voter(String id,int age){
				
				this.id=id;
				this.age=age;
			}
}
			
	






