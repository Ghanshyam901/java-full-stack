package Day2_guided_assignment;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number -: ");
		int num = scn.nextInt();
		
		for(int i=0; i<num ;i++){
			System.out.print(getFibonacciSeries(i) +" , ");
		}
		
		
	}public static int  getFibonacciSeries(int num){
		
		if(num <= 1 ){
			return num;
		}else{
			return getFibonacciSeries(num-1) + ( getFibonacciSeries(num -2));
		}
		
	}
}
