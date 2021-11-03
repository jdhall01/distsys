package language.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Random;

public class ArrayListStats {
	
	protected static void println(Object o) {
		System.out.println(o);
	}

	private static List<Integer> getIntegers() {
		Random rand = new Random();
		PrimitiveIterator.OfInt intIter = rand.ints(10, 1, 5).iterator();
		List<Integer> ints = new LinkedList<Integer>();
		while(intIter.hasNext()) {
			ints.add(intIter.next());
		}
		return ints;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> nums = getIntegers();
		println(nums);
		//nums.forEach(ArrayListStats::println);
		
		println("Minimum: " + Collections.min(nums));
		println("Minimum: " + Collections.max(nums));
		println("Frequency of the first number: " + Collections.frequency(nums, nums.get(0)));
	}

}
