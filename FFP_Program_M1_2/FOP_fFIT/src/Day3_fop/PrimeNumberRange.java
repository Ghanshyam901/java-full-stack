package Day3_fop;

import java.util.Scanner;

public class PrimeNumberRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("ENTER TWO NUMBER -: ");
		int num1 = scn.nextInt();
		int num2 = scn.nextInt();
		
		for(int i = num1; i<=num2; i++){
			if(PrimeNumInRange(i)){
				System.out.print(i+",");
			}
		}
		
		

	}public static boolean PrimeNumInRange(int num){
		
		if(num ==0 || num ==1 ){
			return false;
		}
		if(num == 2){
			return true;
		}
		
		for(int i=2; i*i <= num ;i++){
			if(num%i == 0){
				return false;
			}
		}
		return true;
		
	}

}
