package com.Scanner;
import java.util.Scanner;

public class Vote1Dummy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
		
		
		
		
	System.out.println("Enter your age");
		
		int age=sc.nextInt();
		
		
		String dummy=sc.nextLine();
		
		
		System.out.println("Enter your name");
		
		String s1=sc.nextLine();
		
		
		
		
	
		if(age>=18)
			
			System.out.println(""+s1+" You are eligible to vote !!!!! ");
		
		else
			System.out.println(""+s1+" Sorry You are  not eligible to vote !!!!! ");
	
		
	}

}
