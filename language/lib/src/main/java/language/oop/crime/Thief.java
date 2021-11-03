package language.oop.crime;

import language.oop.justice.Cop;

public class Thief {

	protected static void println(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//try accessing a private member 
		Cop cop = new Cop();
		//cop.gun = 10;//ERROR: not visible
		//cop.gun2 = 10;//ERROR: not visible
		
		//access a public method
		println("Got the gun: " + cop.getGun());
		
		//access a protected method
		//cop.fire();//ERROR: not visible
	}

}
