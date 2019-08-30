package com.nonPremitiveArray;
public class Playlist {

	
	public static void listening(Song[] s1)
	{
			for(int i=0;i<s1.length;i++)
			{
				System.out.println(s1[i].title);
				System.out.println(s1[i].duration);
				System.out.println(s1[i].singer);
				System.out.println("______________");
			}
	}
		public static void main(String[] args) {
		Song[] s1=new Song[7];
		s1[0]=new Song("pachtaoge",4.5,"arijit");
		s1[1]=new Song("Kabhi kabhi",3.25,"arijitSingh");
		s1[2]=new Song("rashqe kamar",4.4,"rahat");
		s1[3]=new Song("chaugada",4.45,"darshan raval");
		s1[4]=new Song("Barish",4.5,"darshan raval");
		s1[5]=new Song("Hawa banke",6.6,"darshan raval");
		s1[6]=new Song("tera zikr",4.5,"darshan Raval");
		listening(s1);
	}
}
