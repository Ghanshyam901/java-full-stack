package Day_5_oops_TakeHome_Assignment;

@SuppressWarnings("serial")
public class WrongPasswordException extends Exception {
	

	String st;
	public WrongPasswordException(){
		
	}
	
	public WrongPasswordException(String st){
		System.out.print(st);
	}
}
