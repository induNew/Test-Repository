package com.nonPremitiveArray;
public class Parking {

	
	public static void parkyard(Bikes[] y1)
	{
			for(int i=0;i<y1.length;i++)
			{
				System.out.println(y1[i].brand);
				System.out.println(y1[i].mileage);
				System.out.println(y1[i].color);
				System.out.println("______________");
			}
	}
		public static void main(String[] args) {
		Bikes[] y1=new Bikes[5];
		y1[0]=new Bikes("yamaha",40.5,"purple");
		y1[1]=new Bikes("cbz",30.25,"red");
		y1[2]=new Bikes("fz",40.4,"black");
		y1[3]=new Bikes("xtreme",45.45,"green");
		y1[4]=new Bikes("hero",48.5,"matt");
		
		parkyard(y1);
	}
}
