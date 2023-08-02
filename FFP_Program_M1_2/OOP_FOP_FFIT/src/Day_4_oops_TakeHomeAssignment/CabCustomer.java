package Day_4_oops_TakeHomeAssignment;

public class CabCustomer {
	private int cusId;
	private String customerName ,picupLocation,dropLocation;
	private int distance;
	private long phoneNumber;
	
	
	public CabCustomer(){
		
	}


	public CabCustomer(int cusId, String customerName, String picupLocation, String dropLocation, int distance,
			long phoneNumber) {
		super();
		this.cusId = cusId;
		this.customerName = customerName;
		this.picupLocation = picupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phoneNumber = phoneNumber;
	}


	public int getCusId() {
		return cusId;
	}


	public void setCusId(int cusId) {
		this.cusId = cusId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getPicupLocation() {
		return picupLocation;
	}


	public void setPicupLocation(String picupLocation) {
		this.picupLocation = picupLocation;
	}


	public String getDropLocation() {
		return dropLocation;
	}


	public void setDropLocation(String dropLocation) {
		this.dropLocation = dropLocation;
	}


	public int getDistance() {
		return distance;
	}


	public void setDistance(int distance) {
		this.distance = distance;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	@Override
	public String toString() {
		return "CabCustomer [cusId=" + cusId + ", customerName=" + customerName + ", picupLocation=" + picupLocation
				+ ", dropLocation=" + dropLocation + ", distance=" + distance + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
