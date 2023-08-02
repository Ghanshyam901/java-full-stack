package Day_2_oops_inhertance_Customer;

public class Personal_Customer extends Customer {
	private long PhoneNo;
	private String PermanentAddress;
	
	public Personal_Customer(){
		
	}
	
	public Personal_Customer(int id, String firstName, String lastName, double balance, long phoneNo,
			String permanentAddress) {
		super(id, firstName, lastName, balance);
		PhoneNo = phoneNo;
		PermanentAddress = permanentAddress;
	}

	public long getPhoneNo() {
		return PhoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		PhoneNo = phoneNo;
	}

	public String getPermanentAddress() {
		return PermanentAddress;
	}

	public void setPermanentAddress(String permanentAddress) {
		PermanentAddress = permanentAddress;
	}

	@Override
	public String toString() {
		return super.toString() + "Personal_Customer [PhoneNo=" + PhoneNo + ", PermanentAddress=" + PermanentAddress + "]";
	}
	
	
	
	
}
