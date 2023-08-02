package Day_4_oops_TakeHomeAssignment;

public class CabCustomerServiceTester {

	public static void main(String[] args) {
		
		CabCustomerService cs = new CabCustomerService();
		
		CabCustomer cc = new CabCustomer(1,"Raj kumar","shalimar","delhi",12,99887766);
		CabCustomer c1 = new CabCustomer(2,"Ghanshyam kumar","New Delhi","delhi",12,9887766);
		CabCustomer c2 = new CabCustomer(3,"Naman ","shalimar bagh","delhi",12,79887766);
		
		cs.addCabCustomer(cc);
		cs.addCabCustomer(c1);
		System.out.println(cs.calculateBill(c2));

		
		cs.showData();
		

	}

}
