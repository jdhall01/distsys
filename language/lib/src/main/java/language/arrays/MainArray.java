package language.arrays;

public class MainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//print the program arguments
		for(int i = 0; i < args.length; i++) {
			System.out.println(String.format("Argument %d is: %s", i+1,  args[i]));
		}
	}

}
