package Day5_takeHomeAssignment;

import java.util.Scanner;

public class ValidString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter String :- ");
		String st = scn.nextLine();

		boolean ans = isPositiveString(st);
		System.out.print("output : "+ans);
	}

	public static boolean isPositiveString(String st) {
		
		if(isValidString(st) == false){
			return false;
		}
		st = st.toLowerCase();
		for(int i=0; i<st.length()-1; i++){
			char ch = st.charAt(i);
			if(ch <= st.charAt(i+1)){
				continue;
			}else{
				return false;
			}
		}
		
		
		
		return true;
	}public static boolean isValidString(String s){
		
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if((ch >='a' && ch <='z') || (ch >='A'&& ch <='Z')){
				continue;
			}else{
				return false;
			}
		}
		return true;
		
	}

}
