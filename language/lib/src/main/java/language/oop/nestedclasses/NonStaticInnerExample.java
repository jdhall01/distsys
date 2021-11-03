package language.oop.nestedclasses;

public class NonStaticInnerExample {
	
	private static String staticSecret = "Outer class static secret";
	private String memberSecret = "Outer class member secret";
	
	public class InnerClass {
		
		//The method printStatic cannot be declared static;
		//static methods can only be declared in a static or top level type
		/*
		public static void printStatic() {
		
		}
		*/
		
		public void print() {
			System.out.println("Inside InnerClass.print()");
			//can access enclosing class static variable
			System.out.println(staticSecret);
			//can access enclosing class member variable
			System.out.println(memberSecret);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main()");
		NonStaticInnerExample.InnerClass objInner = new NonStaticInnerExample().new InnerClass();
		objInner.print();
	}

}
