package Day_7_oops_TakeHomeAssignment;


import java.io.IOException;

public class Student_Test {

	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\DELL\\Desktop\\files\\inputFile.txt";
		DataFile data = new DataFile();
		
		data.readStudents(path);
		
		for(Student st : data.getList()){
			System.out.println(st);
		}
		

	}

}
