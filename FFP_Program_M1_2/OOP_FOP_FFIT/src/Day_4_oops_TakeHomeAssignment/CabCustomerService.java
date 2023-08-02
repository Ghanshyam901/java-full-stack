package Day_4_oops_TakeHomeAssignment;

import java.util.ArrayList;

public class CabCustomerService extends CabCustomer {
	
	private static ArrayList<CabCustomer> al = new ArrayList<>();
	
	public CabCustomerService(){
		
	}
	
	
	public void addCabCustomer(CabCustomer cs){
		al.add(cs);
	}
	
	
	public boolean isNewCustomer(CabCustomer cs){
		
		for(CabCustomer list : al){
			if(list.getPhoneNumber() == cs.getPhoneNumber()){
				System.out.println("Old customer");
				return false;
			}
		}
		System.out.println("New customer");
		al.add(cs);
		return true;
	}
	
	
	public double calculateBill(CabCustomer cs){
		
		boolean isnewcustomer = isNewCustomer(cs);
		
		if(isnewcustomer){
			return 0.0;
		}
		
		double charge = 80.0;
		if(cs.getDistance() <=4){
			return charge;
		}
		
		int extra = Math.abs(4-cs.getDistance());
		return charge + (6*extra);
		
	}
	
	
	public String printBill(CabCustomer cc){
		
		String name = cc.getCustomerName();
		
		return name.toUpperCase() +" Please pay your bill of Rs."+calculateBill(cc);
	}
	
	public void showData(){
		
		for(CabCustomer c : al){
			System.out.println(c);
		}
	}
	
}
