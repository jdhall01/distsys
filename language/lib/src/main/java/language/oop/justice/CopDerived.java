package language.oop.justice;

public class CopDerived extends Cop {
	
	public CopDerived() {
		//this(2);//ERROR: We cannot have both super() and this()
		//the second one among them will give an error: Constructor call must be the first statement.
		super();
		
	}
	
	public CopDerived(int a) {
		
	}
	
	//can access package private from derived class within the same package
	public void accessBasePackagePrivate () {
		super.gun2 = 5;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopDerived copDerived = new CopDerived();
		copDerived.accessBasePackagePrivate();
	}

}
