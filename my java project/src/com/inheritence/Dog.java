package com.inheritence;

public class Dog extends Animal{
	String breed;
	void sniffs()
	{
		System.out.println("Dog sniffs");
	}
	
	Dog()
	{
		
	}
	
	Dog(double height,double weight,String breed)
	{
		super(height,weight);
		this.breed=breed;
		
	}
}
