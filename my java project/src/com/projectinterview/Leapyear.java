package com.projectinterview;
import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter year to check whether leap or not");
		int y=s.nextInt();
		
	if(y%400==0)
	{
	
		System.out.println("A leap year");
	}
		else if(y%4==0 && y%100!=0)
		{
			System.out.println("A leap year");
			
		}
		else
		{
			System.out.println("not a leap year");
		}
		
	}


}
