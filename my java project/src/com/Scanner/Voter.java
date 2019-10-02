package com.Scanner;
import java.util.Scanner;

public class Voter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your first name");
		
		String s1=sc.next();
		
		
		
		System.out.println("Enter your sirname");
		String s2=sc.next();
		
		System.out.println("Enter your age");
		
		int age=sc.nextInt();
		
		
		if(age>=18)
			
			System.out.println(""+s1+" "+s2+" You are eligible to vote !!!!! ");
		
		else
			System.out.println(""+s1+" "+s2+" Sorry You are  not eligible to vote !!!!! ");
	

	}

}
