package Day_5_oops_Guided_Assignment;

public class FakeAccountException extends Exception {
	String st;
	public FakeAccountException(String st){
		System.out.print(st);
	}
}
