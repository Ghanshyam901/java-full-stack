package Day_7_oops_TakeHomeAssignment;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class DataFile {
	
	private List<Student> list;
	
	public DataFile(){
		list = new ArrayList<>();
	}

	public List<Student> getList() {
		return list;
	}

	public void setList(List<Student> list) {
		this.list = list;
	}
	
	
	public void readStudents(String st) throws IOException{
		
		try {
			
			@SuppressWarnings("resource")
			RandomAccessFile rand = new RandomAccessFile(st,"r");
			String student = rand.readLine();
			
			while(student != null){
					Student nst = createStudent(student);
					list.add(nst);
					student = rand.readLine();
			}
			
		} catch (Exception e) {
			throw new RuntimeErrorException(null);
		}
		
	
		
	}public Student createStudent(String st){
		String str [] = st.split(":");
		
		int id = Integer.parseInt(str[0]);
		String name = str[1];
		int [] marks = new int[3];
		int p =0;
		
		for(int i=2; i<str.length; i++){
			marks[p] = Integer.parseInt(str[i]);
			p++;
		}
		
		Student nstudent = new Student(id,name,marks);
		
		
		return nstudent;
		
		
	}
	
	
}		
