package DAY6_W2_TakeHomeAssignment;

import java.util.Scanner;

public class SumDoubleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the double number : ");
		double num = scn.nextDouble();
		
		String ans = concateSumOfDigits(num);
		
		System.out.print(ans);

	}public static String concateSumOfDigits(double num){
		
		String st = String.valueOf(num);
		
		int i =0;
		while(st.charAt(i) != '.'){
			i++;
		}
		
		String left = st.substring(0,i);
		String right = st.substring(i+1,st.length());
		
		int left_s =  getSumOfDigits(left);
		int right_s = getSumOfDigits(right);
		
		StringBuilder sb = new StringBuilder();
		sb.append(left_s);
		sb.append(":");
		sb.append(right_s);
		
		return  sb.toString();
		
	}public static int getSumOfDigits(String st){
		
		int sum =0;
		for(int i=0; i<st.length(); i++){
			char ch = st.charAt(i);
			sum +=ch-'0';
		}
		return sum;
	}

}
