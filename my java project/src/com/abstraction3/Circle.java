package com.abstraction3;

public class Circle implements Shape {
	int length;

	public static void main(String[] args) {
		

	}

	@Override
	public double area(int length) {
		System.out.println("The area of the circle is "+PI*length*length);
		return 0;
	}

}
