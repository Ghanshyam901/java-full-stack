package Day6_w2_fop;

import java.util.Scanner;

public class Fop_day6 {
	public static void main(String [] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the input : ");
		int n = scn.nextInt();
		
		System.out.println("Output :- " +getCode(n));
		
	}public static char getCode(int num){
		
		char [] ch =  {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		
		int ans = getsum(num);
		
		return ch[ans-1];

		
	}public static int getsum(int num){
		
		int sum = 0;
		while(num != 0){
			sum +=num%10;
			num = num/10;
		}
		
		if(sum  > 26){
			return  getsum(sum);
		}
		
		return sum;
	
		
	}
}
