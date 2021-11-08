package language.functional.greetings;

//https://www.educative.io/courses/java-8-lambdas-stream-api-beyond/JP2PrpzzjoK
public class WellWisher {

	public static void wish(Greeting greeting, String message) {
		greeting.greet(message);
	}
	
	public static void wish2(String str) {
		str.length();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lambda
		wish((x) -> System.out.println("Hello " + x), "World");
		wish((x) -> System.out.println(x.toUpperCase()), "World");
		
		//incorrect lambda setup - wish2 must accept a functional interface in its definition
		//ERROR:The target type of this expression must be a functional interface
		//wish2(() -> System.out.println("Namaste!"));

		//the good old anonymous class prior to lambda feature
		wish(new Greeting() {
			@Override
			public void greet(String str) {
				System.out.println("Hello " + str);
			}
		}, "World again");
	}

}
