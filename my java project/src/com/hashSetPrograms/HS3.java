package com.hashSetPrograms;
import java.util.HashSet;
import java.util.Iterator;
public class HS3 {

	
			public static void main(String[] args) {
				
				HashSet<Integer> hs=new HashSet<>();
				
				hs.add(10);
				hs.add(20);
				hs.add(0);
				hs.add(30);
				
				for(Integer ob:hs)
				{
					System.out.println(ob);
					System.out.println("________________");
					
				}
				
				
				Iterator<Integer> t=hs.iterator();
				while(t.hasNext()) {
				int	ob=t.next();
				System.out.println(ob);
				System.out.println("=======================");
				}

	}

}
