package Day_7_oops_GuidedAssignment;

public class FileReadException extends Exception {
	String st;
	
	public FileReadException(String st){
		System.out.print(st);
	}
}
