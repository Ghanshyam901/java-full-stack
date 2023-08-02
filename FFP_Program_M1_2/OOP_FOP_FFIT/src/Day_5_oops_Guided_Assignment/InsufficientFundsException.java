package Day_5_oops_Guided_Assignment;

public class InsufficientFundsException extends Exception {
	String str;
	
	public InsufficientFundsException(){
		
	}
	public InsufficientFundsException(String str){
		System.out.print(str);
	}
	
}
