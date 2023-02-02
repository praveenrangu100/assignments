package assignments;

public class Shape_test {

	public static void main(String[] args) {
		Shape r1=new Rectangle(30.3,45.4);
		System.out.println(r1.getArea());
		r1.printDetails();
		Shape c1=new Circle(23.2);
		System.out.println(c1.getArea());
		c1.printDetails();
		Shape t1= new Triangle(146.2,40);
		System.out.println(t1.getArea());
		t1.printDetails();
	}

}
