package Day_1_guided_assignment_1;

public class Student {
	
	private int Id;
	private String Name;
	private int sub1,sub2,sub3;
	private static int idGen = 101;
	
	public Student(){
		Id = idGen++;
	}

	public Student(String name, int sub1, int sub2, int sub3) {
		this();
		
		Name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getSub1() {
		return sub1;
	}

	public void setSub1(int sub1) {
		this.sub1 = sub1;
	}

	public int getSub2() {
		return sub2;
	}

	public void setSub2(int sub2) {
		this.sub2 = sub2;
	}

	public int getSub3() {
		return sub3;
	}

	public void setSub3(int sub3) {
		this.sub3 = sub3;
	}
	
	public String getRes(int sub1,int sub2,int sub3){
		if(sub1 < 40 || sub2 < 40 || sub3 < 40){
			return "Fail";
		}
		
		int totalMarks=sub1+sub2+sub3;
		double percentage = totalMarks*100/300;
		
		if(percentage >=70){
			return "A";
		}else if(percentage < 70 && percentage >= 55){
			return "B";
		}
		
		return "C";
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", sub1=" + sub1 + ", sub2=" + sub2 + ", sub3=" + sub3 + " ,Result is = " + getRes(sub1, sub2, sub3)+"]";
	}

	

	
	
	
	
	
	
	
	

}
