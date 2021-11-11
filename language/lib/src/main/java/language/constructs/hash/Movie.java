package language.constructs.hash;

public class Movie {

	public Movie(String name, String actor, int year) {
		this.name = name;
		this.actor = actor;
		this.year = year;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " : " + actor + " : " + String.valueOf(year);
	}	
	
	protected String name;
	protected String actor;
	protected int year;
}
