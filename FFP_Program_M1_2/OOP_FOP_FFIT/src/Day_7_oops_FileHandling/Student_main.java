package Day_7_oops_FileHandling;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Student_main {

	public static void main(String[] args) throws IOException 
	{
		List<Student> studentlistHyd = new ArrayList<Student>();
		
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\files\\Book1.csv"));
	    String row=br.readLine();
	    while(row!=null)
	    {
	    	Student s=createStudent(row);
	    	studentlistHyd.add(s);
	    	row=br.readLine();
	    }
	    
	    	Iterator<Student> it=studentlistHyd.iterator();
			while(it.hasNext())
			 {
				Student s=it.next();
				System.out.println(s);
			 }
	}public static Student createStudent(String row) 
	{
		String[] str=row.split(",");
		int id=Integer.parseInt(str[0]);
		String name=str[1];
		String address=str[2];
		Student s1=new Student(id,name,address);
		return s1;
	}

}
