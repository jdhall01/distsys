package language.oop.abstractclass;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal {
	
	protected static void println(Object o) {
		System.out.println(o);
	}
	
	public abstract void makeSound();
	public void move() {
		println(this.getClass().getSimpleName() + " moving");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal animal = new Animal(); //ERROR: cannot instantiate the type Animal
		List<Animal> animals = new ArrayList<>();
		animals.add(new Cat());
		animals.add(new Dog());
		for(Animal animal: animals) {
			animal.makeSound();
			animal.move();
		}
	}

}
