package Day_5_oops_Hospital;

import java.util.ArrayList;

public class Hospital_main {

	public static void main(String[] args) {
		HospitalService hs = new HospitalService();
		ArrayList<String> st = new ArrayList<>();
		st.add("cancer");
		st.add("x-ray");
		
		Hospital h = new Hospital("rk hospital",st,"raj","998866662","delhi");
		hs.addHospital(h);
		Hospital h2 = new Hospital("rj hospital",st,"raj","990866662","delhi");
		hs.addHospital(h2);
		Hospital h3 = new Hospital("rm hospital",st,"raj","960866662","delhi");
		hs.addHospital(h3);
		
		
//		  hs.getHospitals();
		  System.out.print(hs.getHospitalDetails(1001));
	}

}
