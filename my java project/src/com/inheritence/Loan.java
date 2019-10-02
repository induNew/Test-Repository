package com.inheritence;

public class Loan {
	String type;
	double roi;
	int tennure;
	double amount;
	
	void interest(int p)
	{
		double amount1=p+(double)(p*roi*tennure)/100;
		System.out.println("Loan to repay:"+amount1);
		System.out.println("principal:"+p);
		
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
