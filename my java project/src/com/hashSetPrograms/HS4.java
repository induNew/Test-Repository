package com.hashSetPrograms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class HS4{

	
			public static void main(String[] args) {
				
				HashSet hs=new HashSet<>();
				
				hs.add(10);
				hs.add(20);
				hs.add(0);
				
				System.out.println(hs);;
				ArrayList ls=new ArrayList<>(hs);
				Collections.sort(ls);
				System.out.println("after :");
				System.out.println(ls);
				
			
			}
			}