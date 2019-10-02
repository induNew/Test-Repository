package com.treeset;

import java.util.Comparator;

public class SortByID implements Comparator{

	
	public int compare(Object ob1, Object ob2) {
		
		Employee e1=(Employee)ob1;
		Employee e2=(Employee)ob2;
		return e1.id-e2.id;
	}

	
}
