package com.nonPremitiveArray;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song[] s= {new Song("teri meri",4.2,"rahat"),new Song("tera zikr",4.3,"darshan")};
		for(Song s2:s)
		{
			System.out.println("title:"+s2.title);
			System.out.println("singer:"+s2.duration);
			System.out.println("singer:"+s2.singer);
		}

	}

}
