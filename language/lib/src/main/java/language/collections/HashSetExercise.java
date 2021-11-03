package language.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data = {12, 34, 1, 56, 43, 34, 65};
		int duplicate = -1;
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i: data) {
			if(!set.add(i)) {
				duplicate = i;
				break;
			}
		}
		
		System.out.println("Duplicate: " + duplicate);
	}

}
