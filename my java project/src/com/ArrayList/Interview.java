package com.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Interview {

	public static void main(String[] args) {
		ArrayList<Resume>resume=new ArrayList<>();
		resume.add(new Resume("ajay",2019,75.0));
		resume.add(new Resume("santosh",2017,74.0));
		resume.add(new Resume("prassana",2015,69.0));
		resume.add(new Resume("kiran",2018,85.0));
		
		//with the help of iterator
		//System.out.println("Before Sorting"+resume);
		Collections.sort(resume);
		Iterator<Resume>t1=resume.iterator();
		while(t1.hasNext())
		{
			
			Resume res=t1.next();
			
		System.out.println("name: "+res.name+"\nyop :"+res.yop+"\npercentage :"+res.percentage);
		System.out.println("______________________");
		
		}

		//with the help of for loop
		for(int i=0;i<resume.size();i++)
		{
			System.out.println("name"+resume.get(i).name);
			System.out.println("yop"+resume.get(i).yop);
			System.out.println("percentage"+resume.get(i).percentage);
		
		}
		
		
}
}
