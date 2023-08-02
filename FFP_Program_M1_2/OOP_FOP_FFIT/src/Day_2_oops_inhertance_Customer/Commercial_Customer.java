package Day_2_oops_inhertance_Customer;

public class Commercial_Customer extends Customer {

		private long Office_Number;
		private String Billing_Address;
		
		public Commercial_Customer(){
			
		}
		
	

		public Commercial_Customer(int id, String firstName, String lastName, double balance, long office_Number,
				String billing_Address) {
			super(id, firstName, lastName, balance);
			Office_Number = office_Number;
			Billing_Address = billing_Address;
		}



		public long getOffice_Number() {
			return Office_Number;
		}



		public void setOffice_Number(long office_Number) {
			Office_Number = office_Number;
		}



		public String getBilling_Address() {
			return Billing_Address;
		}



		public void setBilling_Address(String billing_Address) {
			Billing_Address = billing_Address;
		}



		@Override
		public String toString() {
			return super.toString()+ "Commercial_Customer [Office_Number=" + Office_Number + ", Billing_Address=" + Billing_Address + "]";
		}



	
		
		
		
}
