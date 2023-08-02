package Day_5_oops_Guided_Assignment;

public class InvalidAccountException extends Exception {

	String st;
	public InvalidAccountException(String st){
		System.out.print(st);
	}
}
