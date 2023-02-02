package assignments;

public class EmployeeDetails {
	public static void main(String[] args) {
		FullTimeEmployee e1= new FullTimeEmployee(1,"Praveen","Rangu","Hyderabad",500000,25000);
		e1.showDetails();
		e1.computeSal();
		PartTimeEmployee E1= new PartTimeEmployee(2,"praveen","rangu","hyderabad",10,750);
		E1.computeSal();
		E1.showDetails();
	}
}