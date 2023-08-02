package Day_1_OOPS_JAVA_DAY7;

public class Customer_main {
	
	static Customer [] Carr = new Customer[100];
	static int carrp = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1 = new Customer();
		c1.setFirstName("virat");
		c1.setLastName("Kohli");
		c1.setAddress("new delhi");
		c1.setSalary(12300);
		Carr[carrp] = c1;
		carrp++;
		
		Customer c2 = new Customer();
		c2.setFirstName("rohit");
		c2.setLastName("Sharam");
		c2.setAddress("new delhi");
		c2.setSalary(40000.0);
		Carr[carrp] = c2;
		carrp++;
		
		Customer c3 = new Customer();
		c3.setFirstName("Rahul");
		c3.setLastName("roy");
		c3.setAddress("new delhi");
		c3.setSalary(60000.0);
		Carr[carrp] = c3;
		carrp++;
		
		
	 System.out.println(withdrawAmount(102,90000.0));
	 System.out.print("Total amount of bank is : "+totalAmount());

	}public static double withdrawAmount(int id , double amount){
		
		for(int i=0; i<carrp; i++){
			Customer c2 = Carr[i];
			if(c2.getId() == id){
				if(c2.getSalary() > amount){
					double remaningBalance = c2.getSalary() - amount;
					Carr[i].setSalary(remaningBalance);
//					c2.setSalary(remaningBalance);
					
					System.out.print("Withdraw Successfull and remaning balance is : ");
					
					return remaningBalance;
					
				}else{
					System.out.print("Withdraw amount is grater than account balance :- ");
					double remaningBalance = c2.getSalary();
					return remaningBalance;
				}
			}
		}
		
		System.out.print("Id not found please enter valid id - : ");
		return -1;
		
	}public static double totalAmount(){
		double sum =0;
		
		for(int i=0; i<carrp; i++){
			sum +=Carr[i].getSalary();
		}
		
		return sum;
		
	}

}
