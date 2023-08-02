package Employee_management;

import java.util.Scanner;

public class Employee_Main {

	public static void main(String[] args)  {
		
		Admin a1=new Admin("Raj","raj@mail.com","123456789");
		Admin a2=new Admin("Rahul","rahul@mail.com","123456789");
		Admin a3=new Admin("Raj","rohit@mail.com","123456789");
		Admin a4=new Admin("john","john@mail.com","123456789");
		
		Admin_Operation op = new Admin_Operation();
		op.AddAdmin(a1);
		op.AddAdmin(a2);
		op.AddAdmin(a3);
		op.AddAdmin(a4);

		Employee em = new Employee("rahul","Sk@mail.com","delhi","IT",9212893444L,50000,2,0.0);
		Employee em1 = new Employee("Rohit","rohit@mail.com","delhi","IT",9299893444l,60000,2,0.0);
		Employee em2 = new Employee("Virat","kohli@mail.com","delhi","IT",9299893444L,70000,3,0.0);
		Employee em3 = new Employee("Rishav","pant17@mail.com","delhi","IT",9299893444L,80000,3,0.0);
		Employee em4 = new Employee("Surya","Sky@mail.com","delhi","IT",9299893444L,90000,4,0.0);
		Employee em5 = new Employee("Shyam","Sk@mail.com","delhi","IT",9299893444L,10000,4,0.0);
		Employee em6 = new Employee("Mukul","mukul@mail.com","delhi","IT",9299893444L,20000,5,0.0);
		Employee em7 = new Employee("Anmol","anmol@mail.com","delhi","IT",9299893444L,30000,5,0.0);
		Employee em8 = new Employee("Rihan","rhnk@mail.com","delhi","IT",9299893444L,40000,10,0.0);
		Employee em9 = new Employee("Sahil","sahil123@mail.com","delhi","IT",9299893444L,50000,10,0.0);
		
		
		
		Employee_System es = new Employee_System();
		es.addEmployee(em);
		es.addEmployee(em1);
		es.addEmployee(em2);
		es.addEmployee(em3);
		es.addEmployee(em4);
		es.addEmployee(em5);
		es.addEmployee(em6);
		es.addEmployee(em7);
		es.addEmployee(em8);
		es.addEmployee(em9);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Admin email : ");
		String Email = sc.nextLine();
		System.out.print("Enter Admin password : " );
		String password = sc.nextLine();
		
		boolean isAdmin = op.isAdmin(Email,password);
		
		if(isAdmin){
			System.out.println("Login successfully... ");
			
			int choice;
			int id=0;
			String data;
			do{
				System.out.println();
				 System.out.println("\n==== Employee Management System ====");
				 System.out.println();
		            System.out.println("1. Add Employee");
		            System.out.println("2. Display Employee");
		            System.out.println("3. Get Salary of Employee");
		            System.out.println("4. Get Employees by Experience");
		            System.out.println("5. Generate Bonus for Employees");
		            System.out.println("6. Search Employee");
		            System.out.println("7. Delete Employee");
		            System.out.println("8. Get Employees by Department");
		            System.out.println("9. Transfer Department");
		            System.out.println("10. data of previous Employees");
		            System.out.println("0. Exit");
		            System.out.println();
		            System.out.print("Enter your choice: ");
				choice = sc.nextInt();
				sc.reset();
				switch(choice){
				case 1:
		            	System.out.print("Enter employee name: ");
		            	sc.nextLine();
		                String name = sc.nextLine();
		                System.out.print("Enter employee email: ");
		                String email = sc.nextLine();
		                System.out.print("Enter employee address: ");
		                String address = sc.nextLine();
		                System.out.print("Enter employee department: ");
		                String department = sc.nextLine();
		                System.out.print("Enter employee phone number: ");
		                long phoneNumber = sc.nextLong();
		                sc.nextLine();
		                System.out.print("Enter employee salary: ");
		                double salary = sc.nextDouble();
		                System.out.print("Enter employee years of experience: ");
		                int yearsOfExperience = sc.nextInt();
		                System.out.print("Enter employee bonus : ");
		                double bonusPercentage = sc.nextDouble();
		                sc.nextLine(); 
		                Employee employee = new Employee(name, email, address, department, phoneNumber, salary, yearsOfExperience, bonusPercentage);
		                es.addEmployee(employee);
		                System.out.println("Employee added successfully!");
		                break;

	            case 2:
		                es.showallEmployee();  
		                break;
	            case 3:
		                System.out.print("Enter employee ID to search: ");
		                int empIdToSearch = sc.nextInt();
		                es.GenerateSalary(empIdToSearch);
		                break;
	            case 4:
		                System.out.print("Enter experience year to search: ");
		                int expYear = sc.nextInt();
		                es.getExperienceEmployee(expYear);
		                break;    
	            case 5:
		                System.out.print("Enter experience year for bonus: ");
		                int expYearForBonus = sc.nextInt();
		                System.out.print("Enter bonus amount: ");
		                double bonusAmount = sc.nextDouble();
		                es.generateBonus(expYearForBonus, bonusAmount);
		                break;    
	           
				case 6:	System.out.println("Enter Employee ID:");
						id = sc.nextInt();
						es.SearchEmployee(id);
						break;
				case 7: System.out.println("Enter Employee ID:");
						id = sc.nextInt();
						es.deleteEmployee(id);
						break;
				case 8:	System.out.println("Enter Department name:");
						sc.nextLine();
						data = sc.nextLine();
						es.getEmpByDept(data);
						break;
				case 9: System.out.println("Enter Emp ID & Department name you want to transfer:");
						id = sc.nextInt();
						sc.nextLine();
						data= sc.nextLine();
						es.DepartmentTransfer(id, data);
						break;
				case 10:
	                	es.showAllPrevEmployee();  
	                	break;		
				case 0:System.out.println("Exiting the Program..");
						break;
				default:System.out.println("Please Enter Correct input...");	
				}
				
			}while(choice !=0);
			sc.close();
		}else{
			System.out.println("Wrong Admin email and password");
		}
		
		
		
		
		
		
		
	}
}
