package Day_4_oops_multiple_inheritance;

public class Student {

	private int id, m1,m2,m3,No_of_Days_Attendence,No_of_Working_days;
	private String Name;
	
	public Student(){
		
	}

	public Student(int id, int m1, int m2, int m3, int no_of_Days_Attendence, int no_of_Working_days, String name) {
		super();
		this.id = id;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		No_of_Days_Attendence = no_of_Days_Attendence;
		No_of_Working_days = no_of_Working_days;
		Name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public int getM3() {
		return m3;
	}

	public void setM3(int m3) {
		this.m3 = m3;
	}

	public int getNo_of_Days_Attendence() {
		return No_of_Days_Attendence;
	}

	public void setNo_of_Days_Attendence(int no_of_Days_Attendence) {
		No_of_Days_Attendence = no_of_Days_Attendence;
	}

	public int getNo_of_Working_days() {
		return No_of_Working_days;
	}

	public void setNo_of_Working_days(int no_of_Working_days) {
		No_of_Working_days = no_of_Working_days;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", No_of_Days_Attendence="
				+ No_of_Days_Attendence + ", No_of_Working_days=" + No_of_Working_days + ", Name=" + Name + "]";
	}
	
	
}
