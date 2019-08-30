package com.nonPremitiveArray;

public class Model {

	
	public static void model(Laptop[] h1)
	{
			for(Laptop a : h1)
			{
				System.out.println(a.brand);
				System.out.println(a.ram);
				System.out.println(a.modelNo);
				System.out.println("______________");
			}
	}
		public static void main(String[] args) {
		Laptop[] h1=new Laptop[5];
		h1[0]=new Laptop("hp",2.0,"Hp1");
		h1[1]=new Laptop("acer",4.0,"acer1");
		h1[2]=new Laptop("asus",6.0,"asus1");
		h1[3]=new Laptop("dell",8.0,"dell1");
		h1[4]=new Laptop("toshiba",2.0,"toshiba1");
		
		model(h1);
	}
}

