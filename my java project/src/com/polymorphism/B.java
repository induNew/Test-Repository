package com.polymorphism;

public class B extends A{
	
	void test()
	{
		System.out.println("from test() of B");
	}

	public static void main(String[] args) {
//		A ob;
//		ob=new A();
//		ob.test();
//		System.out.println("________________________");
//		ob =new B();//auto upcasting
//		ob.test();
//		System.out.println("________________________");
//			
//		A ob2=new B();//IS a /MO/DTC
//		ob2.test();
		
//		A[] array= {new A(),new B(),new A(),new B()};
//		for(int i=0;i<array.length;i++) {
//			
//			array[i].test();
//			System.out.println("_____________________");
//		}
		
		A[] array= {new A(),new B(),new A(),new B()};
		
		
		
		for(A b:array)
		{
			System.out.println(b.test());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
