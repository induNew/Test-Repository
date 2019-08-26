package com.constructor;

public class P8 {
	boolean x;
	double y;
	P8(boolean x,double y)
	{
		this.x=x;
		this.y=y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P8 ob4=new P8(false,2.2);
		P8 ob5=new P8(false,3.2);
		P8 ob6=new P8(false,4.2);
		System.out.println("x:"+ob4.x+"      y:"+ob4.y);
		System.out.println("x:"+ob5.x+"      y:"+ob5.y);
		System.out.println("x:"+ob6.x+"      y:"+ob6.y);
	}

}
