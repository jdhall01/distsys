package language.oop.interfaces;

public class Parrot extends Bird implements CanFly {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		println(getName() + ": " + "flying high!");
	}

}
