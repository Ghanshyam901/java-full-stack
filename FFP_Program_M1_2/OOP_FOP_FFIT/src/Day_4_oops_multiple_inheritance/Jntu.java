package Day_4_oops_multiple_inheritance;

public class Jntu extends Student implements Attendence,Score {

	public Jntu() {

	}

	public Jntu(int id, int m1, int m2, int m3, int no_of_Days_Attendence, int no_of_Working_days, String name) {
		super(id, m1, m2, m3, no_of_Days_Attendence, no_of_Working_days, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getAttendenceper() {
		
		double res = (getNo_of_Working_days()*getNo_of_Working_days())/100; ;
		
		return res;
	}

	@Override
	public double TotalScorePer() {
		double res = ((getM1()+getM2()+getM3())*100)/300;
		return res;
	}

	@Override
	public String toString() {
		return "Jntu [getAttendenceper()=" + getAttendenceper() + ", TotalScorePer()=" + TotalScorePer() + ", getId()="
				+ getId() + ", getName()=" + getName() + "]";
	}
	
	
	
}
