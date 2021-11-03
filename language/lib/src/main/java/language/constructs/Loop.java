package language.constructs;

import java.lang.Math;

public class Loop {

	protected static void println(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//foreach-loop
		int[] arrInt = {1, 2, 3, 4, 5};
		for(int i: arrInt) {
			println(String.format("Power of %d is %d", i, (int)Math.pow(i, 2)));
		}
	}

}
