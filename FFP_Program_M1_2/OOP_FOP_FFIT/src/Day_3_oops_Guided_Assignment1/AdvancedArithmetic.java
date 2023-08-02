package Day_3_oops_Guided_Assignment1;

public interface AdvancedArithmetic {
	
	public abstract int divisorSum(int n);

}class myCalculator implements AdvancedArithmetic{

	@Override
	public int divisorSum(int n) {
		int sum =0;
		for(int i=1; i<=n; i++){
			if(n%i == 0){
				sum+=i;
			}
		}
		return sum;
     }

	
}
