package Day_7_oops_GuidedAssignment;


import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDetails {
	
	private  List<Employee> list ;

	
	public EmployeeDetails(){
		list  = new ArrayList<>();
	}
	
	public List<Employee> getList() {
		return list;
	}

	public void setList(List<Employee> list) {
		this.list = list;
	}
	
	public void readEmployeeDetails(String st) throws IOException, FileReadException{
		
		try{
			BufferedReader br=new BufferedReader(new FileReader(st));
			String row = br.readLine();
			
			while(row != null){
				Employee em = createEmployee(row);
				list.add(em);
				row = br.readLine();
			}
			br.close();
		}
		catch(Exception e){
			throw new FileReadException("File not found");
		}
		
		
		
	}
	public Employee createEmployee(String row) 
	{
		String[] str=row.split(";");
		
		int id=Integer.parseInt(str[0]);
		String name=str[1];
		String designation = str[2];
		Double salary = Double.parseDouble(str[3]);
//		System.out.println(salary);
		Employee E1=new Employee(id,name,designation,salary);
		
		return E1;
	}
	
}
