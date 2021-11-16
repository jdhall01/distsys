package language.exceptions;

//https://stackoverflow.com/questions/34413/why-am-i-getting-a-noclassdeffounderror-in-java
public class NoClassDefFoundErrorDemo {
	
	private static class SimpleCalculator {
		static int undefined = 1 / 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			SimpleCalculator calc1 = new SimpleCalculator();
		} catch (Throwable t) {
			System.out.println(t.getClass().getName());//java.lang.ExceptionInInitializerError
			System.out.println(t.getMessage());
		}
		try {
			SimpleCalculator calc2 = new SimpleCalculator();
		} catch (Throwable t) {
			System.out.println(t.getClass().getName());//java.lang.NoClassDefFoundError
			System.out.println(t.getMessage());
		}
	}

}
