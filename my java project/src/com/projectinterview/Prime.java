package com.projectinterview;
import java.util.Scanner;
public class Prime {

	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("Enter a number");
	int r=scanner.nextInt();
	boolean isPrime=true;
	
	for(int i=2;i<r/2;i++)
{
		
	
	if(r%i==0)
	{
		isPrime=false;
		break;
	}
		
}
	if(isPrime)
	System.out.println(""+r+" is prime");
	else
	{
		System.out.println(""+r+" is not prime");
	}
	
	}
	
}
	