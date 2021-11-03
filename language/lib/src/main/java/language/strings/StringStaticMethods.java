package language.strings;

public class StringStaticMethods {

	protected static void println(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String.valueOf()
		println("My favourite number is " + String.valueOf(25) + ".");
		
		//String.format()
		println(String.format("There are %d days in a %s.", 7, "week"));
	}

}
