package Day3_guided_assignmnet;

import java.util.Scanner;

public class RussianMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter num1 : ");
		int num1 = scn.nextInt();
		System.out.print("Enter num2 : ");
		int num2 = scn.nextInt();
		System.out.print("Ans is : " +russianMultiplication(num1,num2));
		
		
	}public static int russianMultiplication(int num1 , int num2){
		if(num1 < 1 || num2 < 1){
			return -1;
		}
		int sum = num2;
		int sum2 = sum;
		while(num1  >= 1){
			
			if(num1%2 == 0){
				sum += sum*2;
			}else{
				sum2 +=sum*2;
			}
			num1 = num1/2;
			
		}
		
		return sum2;
	}

}
