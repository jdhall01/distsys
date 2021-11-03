package language.casting;

public class NarrowWideCastExample {
	
	protected static void println(Object o) {
		System.out.println(o);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//wide cast
		int numInt = 5;
		float numFloat = numInt;//automatic/implicit casting, does not need (float)
		println(numFloat);//prints 5.0
		
		//narrow cast
		double numDouble = 7.7;
		int numInt2 = (int) numDouble;//explicit casting, needs (int)
		println(numInt2);//prints 7 (does not print 8 - narrows down)
		
		//ceil and floor
		println("Ceil: " + Math.ceil(numDouble));//prints 8.0
		println("Floor: " + Math.floor(numDouble));//prints 7.0
	}

}
