package Employee_management;

import java.util.ArrayList;
import java.util.List;


public class Employee_System extends EmployeeList{
		
	public static List<Employee> prev_emp;   // Athrava
	
	Employee_System(){
		prev_emp = new ArrayList<>();
	}
	
	public void addEmployee(Employee em){      /// Rohan
		boolean isexist = false;
		int getId = em.getEmpId();
		
		for(Employee e : getEmployeeList()){
			if(e.getEmpId() == getId){
				System.out.println("Employee already exist");
				isexist = true;
				break;
			}
		}
		if(isexist == false){
			getEmployeeList().add(em);
		}
		
	}
	

	public void deleteEmployee(int id) { /// Ayush
		boolean isexist = false;
		
		for(Employee e : getEmployeeList()){
			if(e.getEmpId() == id){
				prev_emp.add(e);
				getEmployeeList().remove(e);
				isexist = true;
				System.out.println("Employee successfully deleted ");
				break;			
			}
		}	

		if(isexist == false){
			System.out.println("Employee doesn't exist");
		}
		
		
	}

	public void SearchEmployee(int id) {  // Priyash
		boolean isexist = false;
		for(Employee em : getEmployeeList()){
			if(em.getEmpId() == id){
				System.out.println(em);
				isexist = true;
				break;
			}
		}
		
		if(isexist == false){
			System.out.println("Employee doesn't exist");
		}
		
	}
	

	
	public void getExperienceEmployee(int year){  // Arjun
		boolean isExist = false;
		for(Employee em : getEmployeeList()){
			if(em.getYearOfExp() >= year){
				System.out.println(em);
				isExist = true;
				break;
			}
		}
		if(isExist == false){
			System.out.println("No Employee exist with "+year+" year+ Experience");
		}
	}
	
   public void generateBonus(int expYear, double amount){  // rohan
	   
	   for(Employee em : getEmployeeList()){
		   if(em.getYearOfExp() == expYear){
			   double bonus = amount+em.getBonus();
			   	em.setBonus(bonus);
		   }
	   }
	   
   }
   
   public void GenerateSalary(int empId) {   // Sudip
	   
	   boolean isExist = false;
	   for(Employee em : getEmployeeList()){
		   if(em.getEmpId() == empId){
			   double salary = em.getSalary() + em.getBonus();
			   System.out.println("Your salary WITH Bonus is "+salary);
			   isExist = true;
			   break;
		   }
	   }
	   
	   if(isExist == false){
			System.out.println("Employee doesn't exist");
		}
	   
   }
	
	public void getEmpByDept(String dept){  // Radha
		boolean isExist = false;
		
		dept = dept.toLowerCase();
		
		for(Employee em : getEmployeeList()){
			String getDept = em.getDepartment();
			getDept = getDept.toLowerCase();
			if(getDept.equals(dept) ){
				System.out.println(em);
				isExist = true;
				break;
			}
		}
		if(isExist == false){
			System.out.println("No Employee exist with "+dept+" Department");
		}
		
	}
	
	public void DepartmentTransfer(int EmpId,String newDpt) { // Nutan
		boolean isExist = false;
		
		for(Employee em : getEmployeeList()){
			if(em.getEmpId() == EmpId){
				em.setDepartment(newDpt);
				isExist = true;
				System.out.println(em);
				break;
			}
		}
		if(isExist == false){
			System.out.println("Employee doesn't exist");
		}
	}
	
	public void showallEmployee(){   /// Atharva
		
		for(Employee em : getEmployeeList()){
			System.out.println(em);
		}
		
	}
	
	public void showAllPrevEmployee(){   
		
		for(Employee em : prev_emp){
			System.out.println(em);
		}
		
	}
	

	
}
