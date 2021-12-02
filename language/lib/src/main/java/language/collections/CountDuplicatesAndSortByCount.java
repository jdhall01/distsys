package language.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

public class CountDuplicatesAndSortByCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> nums = Arrays.asList(new Integer[] {70, 50, 30, 10, 20, 40, 60, 70, 30, 10});
		//nums.stream().filter(i -> Collections.frequency(nums, i) >= 1)
		//	.map(Map.Entry::getKey)
			
		//.collect(Collectors.toSet()).forEach(System.out::println);
		Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
		for(Integer i: nums) {
			if(counts.containsKey(i)) {
				int count = counts.get(i);
				counts.replace(i, count+1);
			} else {
				counts.put(i, 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entry: counts.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

}
