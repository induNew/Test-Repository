package com.exceptions;

public class Ce6 {
	public static void main(String[] args) {
		
	System.out.println(1);
	try {
		Class.forName("java.util.scanner");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println(2);
	
	}

}
