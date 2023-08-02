package Day5_takeHomeAssignment;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter String :- ");
		String st = scn.nextLine();
		
		String ans = revString(st);
		System.out.print("Output :- "+ans);

	}public static String revString(String st){
		if(st.length() == 0){
			return "null";
		}
		StringBuilder sb = new StringBuilder();
		for(int i=st.length()-1; i>=0; i--){
			sb.append(st.charAt(i));
		}
		return sb.toString();
	}

}
