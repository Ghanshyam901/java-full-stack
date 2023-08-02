package Day3_guided_assignmnet;

import java.util.Scanner;

public class TruncatablePrimes {
	
	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter  the Input :- ");
		int start = sc.nextInt();
		int end= sc.nextInt();
		
		System.out.print(" values: " + getCountOfLeftTruncatablePrimes(start, end));
		
		
	}
	public static int getCountOfLeftTruncatablePrimes(int start, int end) {
        if (start < 0 || end < 0) {
            return -2;
        }
        if (start == 0 || end == 0) {
            return -3;
        }
        if (start > end) {
            return -1;
        }
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isLeftTruncatablePrime(i)) {
                count++;
            }
        }
        return count;
    } 
	
	public static boolean isLeftTruncatablePrime(int num) {
        if (!isPrime(num)) {
            return false;
        }
        while (num > 0) {
            if (!isPrime(num)) {
                return false;
            }
            num = num % (int) Math.pow(10, Integer.toString(num).length() - 1);
        }
        return true;
    }
	
	 public static boolean isPrime(int num){
        if (num == 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
            
        }
        
        return true;
	 }
	
    
}
