package Day_2_oops_guided_assignment;

public class EmployeeDetails {

	public static void main(String[] args) {
		
		PartTimeEmployee p1 = new PartTimeEmployee();
		p1.FirstName="shyma";
		p1.LastName = "kumar";
		p1.Address="new delhi";
		p1.setAmountPerHour(1200);
		p1.setHoursWorked(2);

		p1.showDetails();
		
		
		FullTimeEmployee f = new FullTimeEmployee();
		f.FirstName="rahul";
		f.LastName="kumar";
		f.Address ="new delhi";
		f.setBasePay(700000);
		f.setBonus(300000);
		
		f.showDetails();

	}

}
