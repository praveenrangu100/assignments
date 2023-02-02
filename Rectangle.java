package assignments;

public class Rectangle extends Shape {
	private double length;
	private double breadth;
	public Rectangle () {
		length=0;
		breadth=0;
	}
	public Rectangle(double length,double breadth) {
		this.length=length;
		this.breadth=breadth;
	}
	public double getArea() {
		double area =length*breadth;
		return area;
	}
	public void printDetails() {
		System.out.println("Rectangle[length="+length+", breadth="+breadth+"]");
	}
}
