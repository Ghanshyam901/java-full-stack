package Day_5_oops_Hospital;

import java.util.ArrayList;
import java.util.HashMap;

public class HospitalService extends Hospital {
	
	public static HashMap<Integer,ArrayList<Hospital>> map = new HashMap<>();
	public static HashMap<Integer,String> Hospitalskv = new HashMap<>();
	
	public HospitalService(){
		
	}
	
	public int addHospital(Hospital hs){
		
		int hsCode = hs.getHospitalCode();
		
		
		map.put(hsCode, new ArrayList<>());
		
		map.get(hsCode).add(hs);
		
		Hospitalskv.put(hsCode, hs.getHospitalName());
		
		return hsCode;
		
		
	}public void getHospitals(){
		
		for(int key : Hospitalskv.keySet()){
			
			System.out.println("HospitalCode: "+ key +" HospitalName : "+ Hospitalskv.get(key));
			
		}
	}
	
	public ArrayList<Hospital> getHospitalDetails(int id){
		
		
		ArrayList<Hospital> list = new ArrayList<>();
		if(map.containsKey(id)){
			list = map.get(id);
			return list;
		}
		
		return null;
		
	}
	
	
	
	
}
