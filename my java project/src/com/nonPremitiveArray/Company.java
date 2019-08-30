package com.nonPremitiveArray;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee e1=new Employee(1,"sher",90);
		//Employee e2=new Employee(2,"sherani",190);
		//Employee e3=new Employee(1,"cub",20);
		Employee[] emp=new Employee[5];
		emp[0]=new Employee(1,"Shera",2.2);
		emp[1]=new Employee(2,"Shael",2.1);
		emp[2]=new Employee(3,"Arc",2.4);
		emp[3]=new Employee(4,"allen",2.6);
		emp[4]=new Employee(5,"Tiger",2.9);
		for(int i=0;i<emp.length;i++)
		{
		System.out.println("employee id:"+emp[i].id+"\n name:"+emp[i].name+"\n salery:"+emp[i].salery);
		}
		System.out.println("+++++++++++++++++");
	}
}
