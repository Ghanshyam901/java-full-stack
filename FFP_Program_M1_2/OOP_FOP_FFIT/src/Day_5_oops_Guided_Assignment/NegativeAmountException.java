package Day_5_oops_Guided_Assignment;

public class NegativeAmountException extends Exception {
	
	String st;
	public NegativeAmountException(String st){
		System.out.print(st);
	}
}
