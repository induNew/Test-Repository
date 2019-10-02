package com.polymorphism;

public class Si extends Interest{
	
	Si()
	{
		
	}
	
	Si(double time,double roi,double principal)
	{
		super(time,roi,principal);
		
	}
	
	void amountofInterest()
	{
		amount=principal+(principal*roi*time)/100;
		System.out.println("amount is = "+amount);
	}
	
	
	
	
	
	
	
}
