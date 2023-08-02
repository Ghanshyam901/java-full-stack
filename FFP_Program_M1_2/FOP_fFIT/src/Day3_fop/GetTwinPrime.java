package Day3_fop;

import java.util.Scanner;

public class GetTwinPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter two number -: ");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		
		System.out.print(getTwinPrime(num1,num2));

	}

	private static String getTwinPrime(int num1, int num2) {
		// TODO Auto-generated method stub
		
		if(num1 > num2 || num2 > 100 || num1 < 1){
			return "Error..";
		}
		
		
		String prime ="";
		
		for(int i=num1; i<=num2-2; i++){
			if(isPrime(i) && isPrime(i+2)){
				prime+=i +","+(i+2)+";";
				i+=2;
			}
		}
		if(prime.length() == 0){
			return " There is not twin primes found ...";
			
		}
		
		return prime;
		
		
		
	}public static boolean isPrime(int num){
		int count  =0;
		
		for(int i=1; i<=num; i++){
			if(num%i == 0){
				count++;
			}
		}
		if(count == 2){
			return true;
		}
		return false;
	}

}
