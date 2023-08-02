package Day_2_oops_guided_assignment;

public class FullTimeEmployee extends Employee {
	
	private double BasePay;
	private double Bonus;
	
	public FullTimeEmployee(){
		
	}

	public FullTimeEmployee(String firstName, String lastName, String address, double basePay, double bonus) {
		super(firstName, lastName, address);
		BasePay = basePay;
		Bonus = bonus;
	}

	public double getBasePay() {
		return BasePay;
	}

	public void setBasePay(double basePay) {
		BasePay = basePay;
	}

	public double getBonus() {
		return Bonus;
	}

	public void setBonus(double bonus) {
		Bonus = bonus;
	}
	
	public double computeSal(){
		return BasePay+Bonus;
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [Id : " + Id + " , fullname = "+getFullName()+" , Address = " + Address
				+ " ,BasePay = " + BasePay + ", Bonus = " + Bonus + ", Gross Salary = " + computeSal() + "]";
	}
	
	public void showDetails(){
		System.out.println(toString());
	}
	
	
	
}
