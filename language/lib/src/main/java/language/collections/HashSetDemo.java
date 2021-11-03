package language.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(2);
		set.add(6);
		set.add(0);
		
		//convert to list for sorting
		List<Integer> setList = new ArrayList<Integer>(set);
		Collections.sort(setList);
		
		//lambda println on each element
		setList.forEach(System.out::println);
	}

}
