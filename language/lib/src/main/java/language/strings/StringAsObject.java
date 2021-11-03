package language.strings;

public class StringAsObject {

	protected static void println(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create an object of String and assign it to a reference
		String strBookTitle = "Microservices Patterns";
		println("Title:" + strBookTitle);
		
		//create a reference of type String
		String strBookAuthor;
		//create an object of String and assign it to a reference
		strBookAuthor = "Chris Richardson";
		println("Author: " + strBookAuthor);
		
		//call some instance methods
		
		println("(CAPS) Title: " + strBookTitle.toUpperCase());
		println("Title Length is " + strBookTitle.length());
		println("Author name begins with " + strBookAuthor.substring(0, 4));
		println("Lot of 'S' in the title: " + strBookTitle.toLowerCase().replace('s', 'S'));
		
		//https://stackoverflow.com/questions/31436337/what-is-java-byte-array-and-how-should-it-be-used
		/*
		 The function a.getBytes() takes a, which is a String, and returns an array of bytes.
		 This can be done because the human-readable characters in a String can be represented as 8-bit numbers, 
		 where the mapping between number and character is determined by the CharSet. 
		 Examples of two common CharSets are ASCII and UTF-8. Now, arr is an array of bytes, 
		 where each byte in the array represents each character in the original string a. 
		 In both ASCII and UTF-8, the String "32" is represented by the bytes 51 and 50 in decimal, 
		 and 0x33 and 0x32 in hexadecimal.
		 Byte arrays are commonly used in applications that read and write data byte-wise, 
		 such as socket connections that send data in byte streams through TCP or UDP protocols.
		 */
		byte[] byteArr = strBookTitle.getBytes();
		//println("Title as Byte Array: " + byteArr.toString());//INCORRECT: prints [B@7a765367
		byteArr[0] = 'N';
		println("Byte array of title modified in-place. First byte is " + byteArr[0] + ". Integer value of 'N' is 78.");
		println("In the title, the value of first char is unchanged, and is " + strBookTitle.charAt(0));

		//length() method on a string literal
		println("Length of 'String Literal' is " + "String Literal".length());
	}

}
