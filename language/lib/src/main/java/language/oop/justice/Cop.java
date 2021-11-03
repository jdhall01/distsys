package language.oop.justice;

public class Cop {
	private int gun; //private member variable
	int gun2; //defaults to package-private
	
	protected static void println(Object o) {
		System.out.println(o);
	}
	
	public Cop () {
		gun = 7;
	}
	
	public int getGun() {
		return gun;
	}
	
	protected void fire() {
		println("Shoot!");
	}
}
