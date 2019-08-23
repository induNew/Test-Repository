package com.nonstatic;

public class Rider {

	public static void main(String[]args){
		// TODO Auto-generated method stub

	
			Vehicle v1=new Vehicle();
			System.out.println("Vehicle colour :"+v1.colour +" Vehicle speed:"+v1.speed+" Vehicle name:"+v1.name);
			
			Vehicle v2=new Vehicle();
			System.out.println("Vehicle colour :"+v1.colour +" Vehicle speed:"+v1.speed+" Vehicle name:"+v1.name);
			v2.colour="Red";
			v2.speed=100;
			v2.name="audi";
			System.out.println("Vehicle colour :"+v2.colour +" Vehicle speed:"+v2.speed+" Vehicle name:"+v2.name);	
			
			
			
			Vehicle v3=new Vehicle();
			v3.colour="Blue";
			v3.speed=150;
			v3.name="Benz";
			System.out.println("Vehicle colour :"+v3.colour +" Vehicle speed:"+v3.speed+" Vehicle name:"+v3.name);
			
	}

}
