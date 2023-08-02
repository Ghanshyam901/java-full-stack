package Day5_Fop;

import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string :- ");
		String sc = scn.nextLine();
		
		String ans = isValid(sc);
		System.out.print("output is : "+ ans);
		

	} public static String isValid(String s) {
        
       Stack<Character> st = new Stack<Character>();
        
        for(char c : s.toCharArray()){
            if(c =='(') 
                st.push(')');
            else if(c == '[') 
                st.push(']');
            else if(c == '{') 
                st.push('}');
            else if(st.isEmpty() || st.pop() != c) 
                return "compilation error";
        }
        return st.isEmpty() ? "successful" : " compilation error" ;
    }

}
