package com.inheritence;

public class Home extends Loan {
		String place;
		
		Home()
		{
		
		}

		Home(String type,double roi,int tennure,String place)
		{
			super(type,roi,tennure);
			this.place=place;
		}
}
