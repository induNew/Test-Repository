package com.inheritence;

public class TwoWheeler extends Vehical{
	
	String name;
	
	TwoWheeler()
	{
		
	}
	
	TwoWheeler(String color,String name)
	{
		super(color);
		this.name=name;
	}
}
