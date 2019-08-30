package com.inheritence;

public class Loan {
	String type;
	double roi;
	int tennure;
	double amount;
	
	double interest(int p)
	{
		double amount1=p+(double)(p*roi*tennure)/100;
		System.out.println(amount1);
		return amount1;
	}
	
	
	Loan()
	{
		
	}
	
	Loan(String type,double roi,int tennure)
	{
		this.type=type;
		this.roi=roi;
		this.tennure=tennure;
		
		
	}
}
