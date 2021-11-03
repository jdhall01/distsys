package language.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Random;
import java.util.stream.Collectors;

//https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
public class ArrayListSortDemo {

	protected static void println(Object o) {
		System.out.println(o);
	}
	
	private static List<String> getStrings() {
		
		/*
		 * To get a single random number
		 * 
		 	Random r = new Random();
			int[] fiveRandomNumbers = r.ints(5, 0, 11).toArray();
			int randomNumber = r.ints(1, 0, 11).findFirst().getAsInt();
		 */
		
		Random rand = new Random();
		PrimitiveIterator.OfInt randIter = rand.ints(5, 0, 10).iterator();
		List<String> strings = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			strings.add("String " + randIter.nextInt());
		}
		
		return strings;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> strings;
		
		//ascending
		
		//using Collections
		strings = getStrings();
		Collections.sort(strings);
		println("Collections sorted: " + strings);
		
		//using sorted
		strings = getStrings();
		strings = strings.stream().sorted().collect(Collectors.toList());
		println("stream sorted: " + strings);
		
		//descending
		
		//using Collections
		strings = getStrings();
		Collections.sort(strings, Collections.reverseOrder());
		println("Collections reverse sorted: " + strings);
		
		//using sorted
		strings = getStrings();
		strings = strings.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		println("stream reverse sorted: " + strings);
	}

}
