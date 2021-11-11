package language.constructs.hash;

import java.util.HashMap;
import java.util.Map;

//https://www.jitendrazaa.com/blog/java/what-is-the-need-to-override-hashcode-and-equals-method/
public class HashMapDemo {

	public HashMapDemo(String type) {
		movies = new HashMap();
		
		for(Object[] movieData: moviesData) {
			Movie movie = MovieFactory.getMovie(type, 
					(String)movieData[0], 
					(String)movieData[1], 
					(int)movieData[2]);
			
			movies.put(movie, (String)movieData[3]);
		}
	}
	
	@Override
	public String toString() {
		StringBuffer strBuff = new StringBuffer();

		for(String val: movies.values()) {
			strBuff.append(val + "; ");
		}
		
		return strBuff.toString();
	}
	
	private static Object[][] moviesData = {
			{"Thank You", "Akshay", 2011, "Thank You"},
			{"Khiladi", "Akshay", 1993, "Khiladi"},
			{"Taskvir", "Akshay", 2010, "Taskvir"},
			{"Taskvir", "Akshay", 2010, "Duplicate Taskvir"}
	};
	
	private Map<Movie, String> movies;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMapDemo faultyMap = new HashMapDemo("MOVIE");
		System.out.println(faultyMap);
		
		HashMapDemo correctMap = new HashMapDemo("MOVIE_ENHANCED");
		System.out.println(correctMap);
	}

}
