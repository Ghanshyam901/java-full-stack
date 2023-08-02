package Day3_fop;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner scn = new Scanner(System.in);
			System.out.print("Enter the number :- ");
			
			int num = scn.nextInt();
			
			int ans = getNaturalNumSum_rec(num);
			System.out.print("sum is :"+ ans);
			
	}public static int getNaturalNumSum(int num){
		int sum =0;
		for(int i=1; i<=num; i++){
			sum+=i;
		}
		return sum;
	}public static int getNaturalNumSum_rec(int num){
		
		if(num <=1){
			return num;
		}else{
			return num +getNaturalNumSum_rec(num-1);
		}
		
		
	}

}
