package com.practice;

public class World {

	public static void main(String[] args) {
		
		
		Dog d1=new Dog();
		d1.talk();

		Cat c1=new Cat();
		c1.talk();
		
		Animal a1=new Dog();
		a1.talk();
		
		a1=new Cat();
		a1.talk();
		
	}

}
