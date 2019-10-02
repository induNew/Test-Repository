package com.projectinterview;

public class InsertElement {

	public static void main(String[] args) {
			int[]arr1=new int[3];
			arr1[0]=1;
			arr1[1]=2;
			arr1[2]=3;
			
			
			
			int i=0;
			int []arr2=new int[arr1.length+1];
			for(i=0;i<arr2.length;i++)
			{
				arr2[i]=arr1[i];
				
				
			}
			
			
			System.out.println(arr2[i]);
	}

}
