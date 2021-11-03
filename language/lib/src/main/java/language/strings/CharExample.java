package language.strings;

public class CharExample {

	protected static void println(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//[] is reserved only for arrays
		String strTitle = "Designing Data-Intensive Applications";
		//println(strTitle[1]);//ERROR: The type of the expression must be an array type 
		
		//charAt(index) returns the char at that index
		String strAuthor = "Martin Kleppmann";
		println("First char of author is " + strAuthor.charAt(0));
		
		//'' for char and "" for string
		//chars are represented as integers
		char a = 'A';
		println(String.format("'A' + 'B' = 65+66=%d", a + 'B'));
	
		//string and char addition results in concatenation
		println(a + "B");//prints "AB"
	}

}
