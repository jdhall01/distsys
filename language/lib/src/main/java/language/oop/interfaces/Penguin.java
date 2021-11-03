package language.oop.interfaces;

public class Penguin extends Bird implements CanFly {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		println(getName() + ": " + "oops! cannot fly.");
	}

}
