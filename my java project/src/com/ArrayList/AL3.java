package com.ArrayList;
import java.util.ArrayList;
public class AL3 {

	public static void main(String[] args) {
		
		ArrayList ls=new ArrayList();
		
		ls.add(10);
		ls.add("hello");
		
		ls.add(new AL("red",10.09));
		AL b=new AL("black",29.9);
		
		ls.add(b);
		System.out.println(ls);
		
				
		

	}

}
