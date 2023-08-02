package Day_6_oops_guided_assignment;

@SuppressWarnings("serial")
public class NegativeAmountException2 extends Exception {

		String st;
		public NegativeAmountException2(){
			
		}
		public NegativeAmountException2(String st){
			System.out.print(st);
		}
}
