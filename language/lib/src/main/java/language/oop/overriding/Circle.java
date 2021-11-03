package language.oop.overriding;

public class Circle extends Shape {
	private double radius;
	
	protected Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public final String toString2() {
		return "Circle";
	}
	
	//ERROR: "private": cannot reduce the visibility of the inherited method 
	/*
	private String toString2() {
		return "Circle";
	}*/

}
