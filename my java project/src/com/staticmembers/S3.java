package com.staticmembers;

public class S3 {
	static int i=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(i);
System.out.println(S3.i);
S3.i=30;
System.out.println(i);
	}

}
 