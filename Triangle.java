package assignments;

public class Triangle extends Shape {
	private double base;
	private double height;
	public Triangle() {
		base=0;
		height=0;
	}
	public Triangle(double base,double height) {
		this.base=base;
		this.height=height;
	}
	public double getArea() {
		return 0.5*base*height;
	}
	public void printDetails() {
		System.out.println("Triangle[base="+base+", height="+height+"]");
	}
	
}
