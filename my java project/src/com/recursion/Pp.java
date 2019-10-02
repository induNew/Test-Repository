package com.recursion;

class Pp
{
	public static void printCh(int a)
	{
		if (a==102)
		{
			return;
		}
		char c;
		c=(char)a;
		System.out.println(c);
		printCh(++a);
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		System.out.println("Main Begin");
		printCh(97);
		System.out.println("Main ends");
	}
}
	