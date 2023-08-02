package Day3_takeHomeAssignment;

import java.util.Scanner;

public class AmicablePairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter starting number : ");
		int start = scn.nextInt();
		System.out.print("Enter ending number :- ");
		int end = scn.nextInt();
	   
		int ans = sumOfAmicablePairs(start , end);
		System.out.print(ans);
	
			
	
	}public static int sumOfAmicablePairs(int start , int end){		
		 int sum = 0;
		 
	        for (int i = start; i <= end; i++) {
	            int sumOfDivisors = getSumOfProperDivisors(i);
	            
	            if (sumOfDivisors > i && sumOfDivisors <= end) {
	                if (i == getSumOfProperDivisors(sumOfDivisors)) {
	                    sum += i + sumOfDivisors;
	                }
	            }
	        }
	        return sum;
		
	}
	
	
	  public static int getSumOfProperDivisors(int num) {
	        int sum = 1;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                sum += i;
	                if (i != num / i) {
	                    sum += num / i;
	                }
	            }
	        }
	        return sum;
	    }

}
