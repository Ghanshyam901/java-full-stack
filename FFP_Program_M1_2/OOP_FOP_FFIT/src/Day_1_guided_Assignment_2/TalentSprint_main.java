package Day_1_guided_Assignment_2;

public class TalentSprint_main {
	
	public static void main(String[] args){
		
		TalentSprint t1 = new TalentSprint();
		
		t1.setName("john");
		t1.setHour(40);
		t1.setBase_Pay(9.8);
		
		System.out.println(t1.toString());
		t1.computeSalary(t1.getBase_Pay(), t1.getHour());
		
		
	}
}
