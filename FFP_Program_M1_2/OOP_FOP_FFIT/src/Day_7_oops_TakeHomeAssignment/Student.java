package Day_7_oops_TakeHomeAssignment;

import java.util.Arrays;

public class Student {
	private int Id;
	private String name;
	private int [] sub ;
	
	public Student(){
		sub = new int[3];
	}

	public Student(int id, String name, int[] sub) {
		super();
		Id = id;
		this.name = name;
		this.sub = sub;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getSub() {
		return sub;
	}

	public void setSub(int[] sub) {
		this.sub = sub;
	}
	
	public int tottalMarks(){
		int marks = 0;
		for(int i=0; i<getSub().length; i++){
			marks +=sub[i];
			
		}
		return marks;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", sub=" + Arrays.toString(sub) + ", tottal Marks()="
				+ tottalMarks() + "]";
	}

	
	
	
	
}
