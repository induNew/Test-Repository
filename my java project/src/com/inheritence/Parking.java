package com.inheritence;

public class Parking {


	public static void main(String[] args) {
		Vehical[] v=new Vehical[5];
		
		// TODO Auto-generated method stub
		
		v[0]=new Bike("Red","CBZ",30);
		v[1]=new TwoWheeler("Yellow","Bus");
		v[2]=new Vehical("Black");
		v[3]=new TwoWheeler("blue","scooty");
		v[4]=new Bike("Green","R15",19);
		
		for(Vehical vehical:v)
		{
			
				System.out.println("color is :" +vehical.color);
				if(vehical instanceof TwoWheeler)
					System.out.println("Name is "+((TwoWheeler)vehical).name);
				if(vehical instanceof Bike)
					System.out.println("Mileagage is "+((Bike)vehical).mileage);
				System.out.println("+++++++++++++++++++++++");
			
			
        }
	}

}
