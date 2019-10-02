package com.projectinterview;

public class Armstrong {

	public static void main(String[] args) {
		
		int n=407;
		int temp=n;
		int sum=0;
		
		while(n>0)
		{
			int unit=n%10;
			sum=sum+unit*unit*unit;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("armstrong");
			
		}
		else
		{
			System.out.println("non armstrong");
		}

}
}
