package language.oop.justice;

public class SeniorCop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//access protected method within package, without inheritance
		Cop cop = new Cop();
		cop.fire();
		
		//access default package-private member variable
		cop.gun2 = 20;
	}

}
