package com.staticmembers;

public class SIB
{
static int i=10;
static
{
	int i=20;
	System.out.println(i); //Local variable
	System.out.println(SIB.i);//accessing variable using class name 
}
public static void main(String[]args)
{
	System.out.println(i); //Global variable
}
}
