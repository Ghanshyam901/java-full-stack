package Day_5_oops_Hospital;

import java.util.ArrayList;

public class Hospital {
	private int HospitalCode;
	private String hospitalName;
	private ArrayList<String> listOfTreatment;
	private String ContactPerson,ContactNumber ,location;
	private static int HospitalidGen = 1000;
	public Hospital(){
		HospitalCode = HospitalidGen++;
	}

	public Hospital( String hospitalName, ArrayList<String> listOfTreatment, String contactPerson,
			String contactNumber, String location) {
		this();
		this.hospitalName = hospitalName;
		this.listOfTreatment = listOfTreatment;
		ContactPerson = contactPerson;
		ContactNumber = contactNumber;
		this.location = location;
	}

	public int getHospitalCode() {
		return HospitalCode;
	}

	public void setHospitalCode(int hospitalCode) {
		HospitalCode = hospitalCode;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public ArrayList<String> getListOfTreatment() {
		return listOfTreatment;
	}

	public void setListOfTreatment(ArrayList<String> listOfTreatment) {
		this.listOfTreatment = listOfTreatment;
	}

	public String getContactPerson() {
		return ContactPerson;
	}

	public void setContactPerson(String contactPerson) {
		ContactPerson = contactPerson;
	}

	public String getContactNumber() {
		return ContactNumber;
	}

	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public static int getHospitalidGen() {
		return HospitalidGen;
	}

	public static void setHospitalidGen(int hospitalidGen) {
		HospitalidGen = hospitalidGen;
	}

	@Override
	public String toString() {
		return "Hospital [HospitalCode=" + HospitalCode + ", hospitalName=" + hospitalName + ", listOfTreatment="
				+ listOfTreatment + ", ContactPerson=" + ContactPerson + ", ContactNumber=" + ContactNumber
				+ ", location=" + location + "]";
	}
	
	
	
	
	
	
}
