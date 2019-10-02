package com.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class AL9 {

	public static void main(String[] args) {
		
		ArrayList<Integer>i=new ArrayList<>();
		i.add(100);
		i.add(200);
		i.add(300);
	
		System.out.println("Enter an element to search in arraylist");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(i.contains(n));
		
		int index=i.indexOf(n);
		int i2=i.get(index);
		
		if(i2%2==0) {
			System.out.println("its even"+i2);
			
		}
		else
			System.out.println("its odd"+i2);

	}

}
