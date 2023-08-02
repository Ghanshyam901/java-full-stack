package Day5_guidedAssignment;

import java.util.Scanner;

public class StringFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the size of array string : ");
		int num = scn.nextInt();
		
		System.out.print("Enter pattern of string : ");
		
		String st = scn.nextLine();
		
		
		String [] str = new String[num];
		for(int i=0; i<num;i++){
			str[i] = scn.nextLine();
		}
		
		getWordsContainsPattern(str,st);
		

	}public static void getWordsContainsPattern(String [] str , String st){
		
	
		for(int i=0; i<str.length; i++){
			if(str[i].contains(st)){
			    System.out.print(str[i].toUpperCase()+",");	
			}
		}
		
		
	}

}
