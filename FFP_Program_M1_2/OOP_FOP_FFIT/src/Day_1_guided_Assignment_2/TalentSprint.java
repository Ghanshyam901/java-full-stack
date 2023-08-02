package Day_1_guided_Assignment_2;

import java.text.DecimalFormat;

public class TalentSprint {
    
	private String Name;
    private double Base_Pay;
    private int Hour;
    
    public TalentSprint(){
    	
    }

	public TalentSprint(String name, double base_Pay, int hour) {
		super();
		Name = name;
		Base_Pay = base_Pay;
		Hour = hour;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getBase_Pay() {
		return Base_Pay;
	}

	public void setBase_Pay(double base_Pay) {
		Base_Pay = base_Pay;
	}

	public int getHour() {
		return Hour;
	}

	public void setHour(int hour) {
		Hour = hour;
	}
	
	public void computeSalary(double Base_Pay, int Hour){
		
		if(Base_Pay < 8.0){
			System.out.print("error");
			
		}else if(Hour > 60){
			System.out.print("error");
		}else if (Hour <= 40){
			System.out.print("Not overTime");
			
		}else{
			int extraHour = Hour-40;
			
			double pay = extraHour*Base_Pay*1.5;
			
			DecimalFormat d=new DecimalFormat("#.##");
			float total =Float.valueOf(d.format(pay));
			
			System.out.print(total +" $");
		}
    
    }

	@Override
	public String toString() {
		return "TalentSprint [Name=" + Name + ", Base_Pay=" + Base_Pay + ", Hour=" + Hour + "]";
	}



	
	
	


	
}
