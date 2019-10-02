package com.projectinterview;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		String reverse="";
		System.out.println("Enter a string you want to reverse");;
		
		Scanner str=new Scanner(System.in);
		String string =str.nextLine();
		
		
		for(int i=string.length()-1;i>=0;i--)
		{
			reverse=reverse+string.charAt(i);
		}
		
		System.out.println(reverse);
		

	}

	
}
