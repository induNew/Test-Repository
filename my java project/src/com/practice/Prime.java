package com.practice;

public class Prime {

	public static void main(String[] args) {
		int num=10;
	int	i=num/2;
		while(num<=i)
		{
			if(num%i==1 ||num%i==num)
			{
				System.out.println("prime number");
			}
			else
			{
				System.out.println("not a prime number");
			}
		
		}num++;

	}

}
