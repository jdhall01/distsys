package language.oop.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Bird {

	public void println(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//looking at birds through the CanFly interface, hence List<CanFly>
		List<CanFly> birds = new ArrayList<>();
		birds.add(new Parrot());
		birds.add(new Penguin());
		for(CanFly bird: birds) {
			bird.fly();
		}
	}

}
