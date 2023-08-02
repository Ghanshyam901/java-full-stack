package Day_4_oops_GuidedAssignmnet;

import java.util.HashMap;

public class CollectionMap extends Employee{

	public static HashMap<Integer,Employee> employeeMap = new HashMap<>();
	
	public int Addemployee(int i, String string, double d){
		
		if(employeeMap.containsKey(i)){
			return 2;
		}else{
			Employee emp = new Employee(i,string,d);
			
			employeeMap.put(i,emp);
		}

		return 0;
		
	}
	
	public int removeEmployee(int empid){
		if(employeeMap.containsKey(empid)){
			employeeMap.remove(empid);
			return 0;
		}else if(!employeeMap.containsKey(empid)){
			return 2;
		}else{
			
		}
		return 1;
	}
	
	public String findEmployee(int empid){
		
		if(employeeMap.containsKey(empid)){
			return "Success";
		}
		
		return "Null";
		
	}
	
	public void getEmployeeList(){
		
		for(int key : employeeMap.keySet()){
			System.out.println(employeeMap.get(key));
		}
		
	}
	
	
}
