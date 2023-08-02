package Day2_guided_assignment;

import java.util.Scanner;

public class FizzBizz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a input num :- ");
		int num = scn.nextInt();
		
		String ans = Fizz_Bizz(num);
		System.out.println(ans);
		
		
	}public static String Fizz_Bizz(int num){
		if(num < 1){
			return "ERROR";
		}
	     else if(num%3 == 0 && num % 5 == 0){
			return "FIZZBIZZ";
		}else if(num % 5 == 0){
			return "BIZZ";
		}else if(num % 3 == 0){
			return "FIZZ";
		}else{
			
		}
		
		return String.valueOf(num);
		
	}

}
