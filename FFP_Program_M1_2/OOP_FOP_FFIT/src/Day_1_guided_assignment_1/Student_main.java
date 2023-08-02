package Day_1_guided_assignment_1;

public class Student_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student();
		s1.setName("rahul");
		s1.setSub1(30);
		s1.setSub2(40);
		s1.setSub3(40);
		
		System.out.println(s1.toString());
	
		
		Student s2 = new Student("sk",90,80,90);
		
		System.out.println(s2.toString());

		
		
		
	}

}
