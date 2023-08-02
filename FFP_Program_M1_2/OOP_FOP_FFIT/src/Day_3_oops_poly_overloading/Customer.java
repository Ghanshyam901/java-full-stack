package Day_3_oops_poly_overloading;

public class Customer {
	private int cusId;
	private String customerName;
	private String pickupLocation;
	private String dropLocation;
	private int distance;
	private long phone;
	
	public Customer(){
		
	}

	public Customer(int cusId, String customerName, String pickupLocation, String dropLocation, int distance,
			long phone) {
		super();
		this.cusId = cusId;
		this.customerName = customerName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phone = phone;
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

	public String getPickupLocation() {
		return pickupLocation;
	}

	public void setPickupLocation(String pickupLocation) {
		this.pickupLocation = pickupLocation;
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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	public double calculateBill(){
		
		if(distance <= 4){
			return 80.0;
		}
		
		double dis =Math.abs(4-distance);
		
		return 80 +(dis*6);
		
	}

	@Override
	public String toString() {
		return "Customer [cusId=" + cusId + ", customerName=" + customerName + ", pickupLocation=" + pickupLocation
				+ ", dropLocation=" + dropLocation + ", distance=" + distance + ", phone=" + phone
				+ ", calculateBill()=" + calculateBill() + "]";
	}
	
	
	
	
}


