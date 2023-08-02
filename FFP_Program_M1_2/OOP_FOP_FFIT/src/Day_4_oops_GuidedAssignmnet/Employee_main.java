package Day_4_oops_GuidedAssignmnet;



public class Employee_main{

	
	
	public static void main(String[] args) {
		
		
		
		
		CollectionMap em = new CollectionMap();
		em.Addemployee(9, "sk", 1222);
		em.Addemployee(1, "sk", 1222);
		em.Addemployee(2, "s", 1222);
		em.Addemployee(9, "sdd", 1222);
		
	
		System.out.println(em.findEmployee(9));
		em.getEmployeeList();
		
		
	}
	

}
