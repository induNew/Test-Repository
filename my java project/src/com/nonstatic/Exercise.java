//1 creating class of Exercise and have static,non static variables
//have one non static method
//access the static member in static context 



//2. Access static members inside non static context.

package com.nonstatic;

public class Exercise {

		static int a;
		int b;
		
		void test()
		{
			//accessing static inside non static context
			
			System.out.println(a);//directly/20
			Exercise.a=200;//using class name
			System.out.println(this.a);
			
			//accessing non static member from non static context
			
			System.out.println(b);//directly/10
			System.out.println(this.b);
			
		}
		

		public static void main(String[]args)
		{
			//accessing static members from static context
			
			System.out.println(a);
			Exercise.a=20;
		    System.out.println(Exercise.a);
		    
		    //accessing non static from static context
			Exercise E1=new Exercise();
			E1.b=10;//creating an object and using an object reference
			E1.test();
			System.out.println(E1.b);//10
			
		}
}
