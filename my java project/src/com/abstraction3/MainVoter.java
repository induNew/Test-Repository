package com.abstraction3;

public class MainVoter extends Voter  {
	
	String name;
	
	
	MainVoter(String id,int age,String name)
	{
		super(id,age);
		this.name=name;
	}

	public static void main(String[] args) {
		MainVoter v1=new MainVoter("YY123",16,"suraj");
		System.out.println("Name:"+v1.name +"  is of age   "+v1.getage()+" and eligible to vote");
		Voter v2=v1;
		v2.setage(16);
		System.out.println("Name:"+v1.name +"  is of age   "+v1.getage()+" having voter id as "+v1.getid());
		

	}

}



