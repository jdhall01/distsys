package language.arrays.optional;

import java.util.Optional;

//https://www.baeldung.com/java-optional
public class OptionalExample {

	protected static void println(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//empty Optional
		Optional<String> emptyOpt = Optional.empty();
		println(emptyOpt.isEmpty());
		
		//filled Optional
		String str = "Hello";
		Optional<String> filledOpt = Optional.of(str);
		println(filledOpt.isPresent());
		
		//fill if null
		String nullStr = null;//needed, else Typemismatch, cannot convert from Object to String
		String strFillIfNull = Optional.ofNullable(nullStr).orElse("Hello");
		println(strFillIfNull);
		
		//print if present
		str = "Jeetu";
		Optional<String> filledOpt2 = Optional.of(str);
		filledOpt2.ifPresent(name -> println(name));
	}

}
