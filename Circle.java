package assignments;

public class Circle extends Shape {
	private double radius;
	public Circle() {
		radius=0;
	}
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public void printDetails() {
		System.out.println("Circle[radius="+radius+"]");
	}

}
