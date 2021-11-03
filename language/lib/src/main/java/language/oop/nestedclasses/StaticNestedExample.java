package language.oop.nestedclasses;

public class StaticNestedExample {
	
	private static String staticSecret = "Outer class static secret";
	private String memberSecret = "Outer class member secret";

	public static class StaticNested {
		public void print() {
			//System.out.println("");
			System.out.println("Inside StaticNested.print()");
			//can access enclosing class static variable
			System.out.println(staticSecret);
			//canNOT access enclosing class member variable
			//System.out.println(memberSecret);//Error: Cannot make static reference to non-static field
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main()");
		StaticNestedExample.StaticNested objStaticNested = new StaticNestedExample.StaticNested();
		objStaticNested.print();
	}

}
