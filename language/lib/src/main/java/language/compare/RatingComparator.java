package language.compare;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movie> {

	@Override
	public int compare(Movie o1, Movie o2) {
		// TODO Auto-generated method stub
		
		if(o1.getRating() <= o2.getRating()) {
			return -1;
		} else {
			return +1; 
		}
	}

}
