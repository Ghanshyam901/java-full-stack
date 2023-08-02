package Employee_management;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList extends Employee {
	
	private static  List<Employee> employeeList;
	public EmployeeList(){
		employeeList = new ArrayList<>();
		
	}

	public EmployeeList(List<Employee> employeeList) {
		super();
		this.employeeList = employeeList;
	}
	
	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
	

	@Override
	public String toString() {
		return "EmployeeList [employeeList=" + employeeList + "]";
	}


	
	
	
	
	
}
