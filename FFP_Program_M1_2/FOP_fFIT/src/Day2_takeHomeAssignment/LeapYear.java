package Day2_takeHomeAssignment;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter year :- ");
		int year = scn.nextInt();
	
		isLeapYear(year);	
		
	}public static void isLeapYear(int year){
		if(year % 400 == 0 || ((year % 100 != 0) && (year % 4 == 0))){
			System.out.print(year +" - a leap year");
		}else{
			System.out.print(year +" - not a leap year");
		}
	}

}
