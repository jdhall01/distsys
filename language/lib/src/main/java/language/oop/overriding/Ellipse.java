package language.oop.overriding;

public class Ellipse extends Circle {
	double width, height;
	public Ellipse(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return Math.PI*width*height;
	}
	
	//ERROR: Cannot override the final method from Cicrle
	/*
	public String toString2() {
		return "Ellipse";
	}*/
}
