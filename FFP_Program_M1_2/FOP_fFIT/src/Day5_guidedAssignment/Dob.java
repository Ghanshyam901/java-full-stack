package Day5_guidedAssignment;

import java.util.Scanner;

public class Dob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter a string dd-mm-year : ");
		String st = scn.nextLine();
		
		System.out.print(getLuckyNumber(st));;
		
	}public static int getLuckyNumber(String st){
	   
		String month = getMonthString(st);
		int month_ = getMonth(month);
		
		String year = getYear(st);
		int year_ = Integer.valueOf(year);
		
		String date = getDate(st);
		int date_ = Integer.valueOf(date);
		
		String dig = date+month+year;
		
		int ans = getSumOfDigits(dig);
		
		
		
		return ans;
		
	
	}public static String  getMonthString(String st){
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<st.length(); i++){
			char ch = st.charAt(i);
			if((ch >='a' && ch <='z') || (ch >='A' && ch <='Z')){
				sb.append(ch);
			}
		}
		return sb.toString();
		
	}
	
	public static String getYear(String st){
		
		int length = st.length();
		String year = st.substring(length-4,length);
		
		return year;
	}
	
	
	
	
	public static int getMonth(String st){
		
		String[] month = {"january","february","march","april","may","june","july","august","september","october","november","december"};
		st = st.toLowerCase();
		for(int i=0; i<month.length; i++){
			if(month[i].contains(st)){
				return i+1;
			}
		}
		return -1;
		
		
	}public static String getDate(String st){
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<st.length(); i++){
			char ch = st.charAt(i);
			if(ch !='-'){
				sb.append(ch);
			}else{
				break;
			}
		}
		return sb.toString();
	}public static int getSumOfDigits(String dig){
		
		int val = 0;
		while(dig.length() > 1){
			
			for(int i=0; i<dig.length(); i++){
				char ch = dig.charAt(i);
				val+=ch-'0';
			}
			dig = String.valueOf(val);
			if(dig.length() < 2){
				break;
			}
			val =0;
		}
		
		
		return Integer.valueOf(dig);
		
	}

}
