package language.constructs.hash;

public class MovieFactory {

	public static Movie getMovie(String type, String name, String actor, int year) {
		switch(type) {
		case "MOVIE":
			return new Movie(name, actor, year);
		case "MOVIE_ENHANCED":
			return new MovieEnhanced(name, actor, year);
		default:
			return null;
		}
	}
}
