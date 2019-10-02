package com.ArrayList;

import java.util.Comparator;
	public class SortByReleaseYear implements Comparator<Movie>{
		

		public int compare(Movie n1, Movie n2) {
			
			if(n1.releaseYear<n2.releaseYear)
				return -1;
				else if(n1.releaseYear<n2.releaseYear)
				return 1;
				else
				return 0;

}
	}




