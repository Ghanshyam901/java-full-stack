package Day_3_oops_poly_overloading;

public class CabCustomerServiceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Customer c = new Customer();
		c.setCusId(101);
		c.setCustomerName("rahul");
		c.setDistance(6);
		c.setDropLocation("karol bagh");
		c.setPickupLocation("shalimar bagh");
		c.setPhone(987654555);
		
		
		Customer c2 = new Customer();
		
		c2.setCusId(102);
		c2.setCustomerName("rohit");
		c2.setDistance(9);
		c2.setDropLocation("karol bagh");
		c2.setPickupLocation("rani bagh");
		c2.setPhone(987654555);
		
		Customer c3 = new Customer(103,"sk","delhi","new delhi",7,99998887);
		
		
		if(c.calculateBill() > c3.calculateBill()){
			System.out.print(c.toString());
		}else{
			System.out.print(c3.toString());
		}

	}

}
