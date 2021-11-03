package language.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.common.base.MoreObjects.ToStringHelper;

public class Movie implements Comparable<Movie> {
	
	protected static void println(Object o) {
		System.out.println(o);
	}

	private String name;
	private double rating;
	private int year;
	
	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}

	public int getYear() {
		return year;
	}

	public Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}
	
	public String toString() {
		return String.format("(%s, Rating: %2.2f, Year: %d)", name, rating, year);
	}
	
	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.year - o.year;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("Force Awakens", 8.3, 2015));
		movies.add(new Movie("Star Wars", 8.7, 1977));
		movies.add(new Movie("Empire Strikes Back", 8.8, 1980));
		movies.add(new Movie("Return of the Jedi", 8.4, 1983));
        
		//sort using Collections.sort and Comparable (implied)
		Collections.sort(movies);
		println("Collections.sort and Comparable:\n" + movies);
		
		//sort using Collections.sort and NameComparator
		Collections.sort(movies, new NameComparator());
		println("sort using Collections.sort and NameComparator:\n" + movies);
		
		//sort using Collections.sort and RatingComparator
		Collections.sort(movies, new RatingComparator());
		println("sort using Collections.sort and RatingComparator:\n" + movies);

		//anonymous classes
		
		//sort using Collections.sort and NameComparator
		Collections.sort(movies, new Comparator<Movie> () {
			@Override
			public int compare(Movie o1, Movie o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		});
		println("sort using Collections.sort and anonymous class name comparator:\n" + movies);
		
		//lambdas
		
		//sort using Collections.sort and lambda for rating comparator
		Collections.sort(movies, (o1, o2) -> {if(o1.getRating() <= o2.getRating()) {return -1;} else {return +1;}});
		println("sort using Collections.sort and lambda for rating comparator :\n" + movies);
	}

}
