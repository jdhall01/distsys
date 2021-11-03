package language.strings;

public class ImmutableString {
	
	protected static void println(Object o) {
		System.out.println(o);
	}
	
	private static String modifyString(String in) {
		//in.charAt(0) = '$';//ERROR: The left-hand side of an assignment must be a variable
		return in.toUpperCase();//'in' is IMMUTABLE. an upper-case COPY of 'in' will be returned
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an object of String
		String strLower = "this is the new low.";
		println("Original String: " + strLower);
		
		//pass the object to a string modifying function
		String strUpper = modifyString(strLower);
		println("Original String after passing to modifyString(): " + strLower);
		
		//a new instance of modified string is returned from modifyString
		println("Modified copy of string is:" + strUpper);
	}

}
