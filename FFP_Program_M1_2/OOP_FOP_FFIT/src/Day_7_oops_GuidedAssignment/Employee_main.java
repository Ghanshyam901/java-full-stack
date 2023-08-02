package Day_7_oops_GuidedAssignment;

import java.io.IOException;

public class Employee_main {

	public static void main(String[] args) throws IOException, FileReadException {
		// TODO Auto-generated method stub
		
		String FileName = "C:\\Users\\DELL\\Desktop\\files\\EmployeeData.txt";
		EmployeeDetails details = new EmployeeDetails();
		details.readEmployeeDetails(FileName);
		
		for(Employee em :details.getList()){
			System.out.println(em);
		}

	}

}
