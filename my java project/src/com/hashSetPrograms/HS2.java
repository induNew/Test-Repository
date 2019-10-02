package com.hashSetPrograms;
import java.util.HashSet;
import java.util.Iterator;
public class HS2 {

	
			public static void main(String[] args) {
				
				HashSet hs=new HashSet();
				
				hs.add(10);
				hs.add(20);
				hs.add(0);
				hs.add(30);
				
				for(Object ob:hs)
				{
					System.out.println(ob);
					System.out.println("________________");
					
				}
				
				
				Iterator t=hs.iterator();
				while(t.hasNext()) {
				Object	ob=t.next();
				System.out.println(ob);
				System.out.println("=======================");
				}

	}

}
