package language.oop.overriding;

import java.util.ArrayList;
import java.util.List;

public class Shape {
	public double getArea() {
		return 0;
	}
	
	public String toString2() {
		return "Shape";
	}
	
	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Rectangle(2, 3));
		shapes.add(new Circle(2));
		shapes.add(new Ellipse(2, 3));
		for(Shape shape: shapes) {
			System.out.println(shape.toString2() + ": " + shape.getArea());
		}
	}
}
