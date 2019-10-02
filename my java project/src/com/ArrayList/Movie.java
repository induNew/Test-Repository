package com.ArrayList;

public class Movie implements Comparable<Movie>{

		String name;
		double rating;
		int releaseYear;
		
		
		Movie()
		{}
			
		Movie(String name,double rating,int releaseYear){
			this.name=name;
			this.rating=rating;
			this.releaseYear=releaseYear;
		}
		
		public int compareTo(Movie movie)
		{
			if(this.rating<movie.rating)
			return -1;
			else if(this.rating<movie.rating)
			return 1;
			else
			return 0;
			
		
		}
		
		
		

	
	
	public String toString() {
		return "\n"+"\nname		: " + name + " \nrating 		:" + rating + " \nreleaseYear 	:" +releaseYear;
		
	}
		
		
		
	
	
		}


