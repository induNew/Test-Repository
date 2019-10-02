package com.threadprogs;

public class R {

	public static void main(String[] args) {
		
		Runnable r1=()->{
			for(int i=0;i<4;i++) {
				System.out.println("Body 1");
			}
		};
		
		Runnable r2=()->{
			for(int j=0;j<4;j++) {
				System.out.println("Body 2");
			}
		};
		
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		
		t1.start();
		t2.start();
		
		
			
		
	}

}
