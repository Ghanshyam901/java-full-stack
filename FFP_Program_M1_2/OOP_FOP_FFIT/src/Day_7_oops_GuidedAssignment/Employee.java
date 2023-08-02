package Day_7_oops_GuidedAssignment;

public class Employee {
	private int EmployeeId;
	private String EmployeeName;
	private String EmployeeDesination;
	private Double Salaray;
	
	public Employee(){
		
	}

	public Employee(int employeeId, String employeeName, String employeeDesination, Double salaray) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeDesination = employeeDesination;
		Salaray = salaray;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getEmployeeDesination() {
		return EmployeeDesination;
	}

	public void setEmployeeDesination(String employeeDesination) {
		EmployeeDesination = employeeDesination;
	}

	public Double getSalaray() {
		return Salaray;
	}

	public void setSalaray(Double salaray) {
		Salaray = salaray;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeDesination="
				+ EmployeeDesination + ", Salaray=" + Salaray + "]";
	}
	
	
}
