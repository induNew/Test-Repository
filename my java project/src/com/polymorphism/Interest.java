package com.polymorphism;

public class Interest {
	double time;
	double roi;
	double principal;
	double amount;
	
	Interest()
	{
		
	}
	
	Interest(double time,double roi,double principal)
	{
		this.time=time;
		this.roi=roi;
		this.principal=principal;
	}
	
	void amountofInterest()
	{
		System.out.println("Iterest is getting evaluated");
	}
	

}
