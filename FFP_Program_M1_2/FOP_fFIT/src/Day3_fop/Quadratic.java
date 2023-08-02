package Day3_fop;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("enter the number :- ");
		int n = scn.nextInt();
		
		System.out.print(getQuadratic(n));
		
	}public static String getQuadratic(int num){
		
		if(num <= 1){
			return "Negative number";
		}
		
		String ans ="";
		
		int num2 = 1;
		int num1gap = 2;
		int count =0;
		
		while(count != num){
			ans+= num2+",";
			count++;
			num2 = num2+num1gap;
			num1gap++;
		}
	
		
		
		return ans.substring(0,ans.length()-1);
	}

}
