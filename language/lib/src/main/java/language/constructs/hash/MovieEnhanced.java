package language.constructs.hash;

public class MovieEnhanced extends Movie {

	public MovieEnhanced(String name, String actor, int year) {
		super(name, actor, year);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();
		return name.hashCode() + actor.hashCode() + year;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//return super.equals(obj);
		Movie movie = (Movie) obj;
		if(movie.name.equals(name) &&
				movie.actor.equals(actor) &&
				movie.year == year) {
			return true;
		} else {
			return false;
		}
	}
}
