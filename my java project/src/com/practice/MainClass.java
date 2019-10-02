package com.practice;

public class MainClass {
	public static void main(String[] args) {
		
		
		Browser1 ref=new Browser1();
		ref.searchEngine1();
		
		Browser2 ref1=new Browser2();
		ref1.searchEngine1();
		
		ref=ref1;
		ref.searchEngine1();
		
	}
}
