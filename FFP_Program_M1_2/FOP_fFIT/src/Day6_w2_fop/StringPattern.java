package Day6_w2_fop;

import java.util.Scanner;
import java.util.Stack;

public class StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter string : ");
		String st = scn.nextLine();
		
		boolean ans = isPatterValid(st);
		if(ans == true){
			System.out.print("valid");
		}else{
			System.out.print("In-valid");
		}
		
		
	}public static boolean isPatterValid(String str){
		
		Stack<Character> st = new Stack();
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if(st.size() == 0 && ch == '}' || ch == ')' || ch ==']'){
				return false;
			}
			
			
			if(ch == '[' || ch =='{' || ch == '('){
				st.push(ch);
			}else{
				if(ch == ']' && st.peek() == '['){
					st.pop();
				}else if(ch == '}' && st.peek() == '{'){
					st.pop();
				}else if(ch ==')' && st.peek() == '('){
					st.pop();
				}else{
					
				}
			}
		}
		
		if(st.size() == 0){
			return true;
		}
		return false;
		
		
	}

}
