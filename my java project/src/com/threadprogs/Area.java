package com.threadprogs;

public class Area {

	public static void main(String[] args) {
		
		I2 ob1=(int i)->
		{
			double area1=i*i;
			System.out.println("area of square "+area1);
		};
		
		
		I2 ob2=(int i)->
		{
			double area2=3.14*i*i;
			System.out.println("area of circle "+area2);
		};
		
		
		ob1.area(10);
		ob2.area(10);

	}

}
