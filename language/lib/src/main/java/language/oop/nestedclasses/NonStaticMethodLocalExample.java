package language.oop.nestedclasses;

public class NonStaticMethodLocalExample {
	
	public void print() {
		System.out.println("Inside NonStaticMethodLocalExample.print()");
		
		String localSecret = "Local secret";
		
		class MethodLocal {
			public void print() {
				System.out.println("Inside MethodLocal.print()");
				//can access enclosing function local variables
				System.out.println(localSecret);
			}
		}
		
		MethodLocal mlObj = new MethodLocal();
		mlObj.print();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethodLocalExample obj = new NonStaticMethodLocalExample();
		obj.print();
	}

}
