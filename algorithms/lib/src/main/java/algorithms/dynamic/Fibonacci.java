package algorithms.dynamic;

public class Fibonacci {

	//get the n-th fibonacci number
	public static int fibonacci(int n) {
		int[] arrNums = new int[n];
		arrNums[0] = 1;
		arrNums[1] = 1;
		
		for(int i = 2; i < n; i++) {
			arrNums[i] = arrNums[i-1] + arrNums[i-2];
		}
		
		return arrNums[n-1];
	}
	
	public static int fibonacci2(int n) {
		int a = 1, b = 1;
		int c = 0;
		for(int i = 2; i < n; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		System.out.println(fibonacci(n));
		System.out.println(fibonacci2(n));
	}

}
