package language.arrays;

import java.util.Arrays;

public class ArraysExample {
	
	protected static void println(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an array of integers and initialize it
		int[] arrInt = {4, 1, 0, 2, 3};
		println("The original array is: " + Arrays.toString(arrInt));
		
		//sort the array
		Arrays.sort(arrInt); //sorted in-place
		
		//print the sorted array
		println("The sorted array is: " + Arrays.toString(arrInt));
	}

}
