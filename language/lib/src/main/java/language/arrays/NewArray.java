package language.arrays;

public class NewArray {
	
	protected static void println(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an array of integers using new
		int[] arrInt = new int[5];
		println("the last element of arrInt is " + arrInt[arrInt.length-1]);
		
		//initialize the array
		for(int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i;
		}
		
		println("the last element of arrInt is " + arrInt[arrInt.length-1]);
	}

}
