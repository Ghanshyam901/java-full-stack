package Day_6_oops_guided_assignment;

@SuppressWarnings("serial")
public class AmountException extends Exception{
	
	String st;
	public AmountException(){
		
	}
	 public  AmountException(String st){
		 System.out.print(st);
	 }

}
