package Day_2_oops_guided_assignment;

public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double amountPerHour;
	
	public PartTimeEmployee(){
		
	}

	public PartTimeEmployee(String firstName, String lastName, String address, int hoursWorked, double amountPerHour) {
		super(firstName, lastName, address);
		this.hoursWorked = hoursWorked;
		this.amountPerHour = amountPerHour;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getAmountPerHour() {
		return amountPerHour;
	}

	public void setAmountPerHour(double d) {
		this.amountPerHour = d;
	}
	
	public double computeSalary(){
		double salary = hoursWorked*amountPerHour;
		return salary;
	}
	
	

	@Override
	public String toString() {
		return  "PartTimeEmployee [Id : " + Id
				+ " , fullname = "+getFullName()+" , Address = " + Address + " , hoursWorked : " + hoursWorked + ", amountPerHour : " + amountPerHour + ", computeSalary = "
				+ computeSalary() + "]";
	}
	
	public void showDetails(){
		System.out.println(toString());
	}
	
	
}
