package DAY6_W2_TakeHomeAssignment;

import java.util.Scanner;

public class timeZone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the double number : ");
		
		String time = scn.nextLine();
		boolean ans = isValidTime(time);
		
		if(ans){
			System.out.print("True");
		}else{
			System.out.print("False");
		}
		
	}public static boolean isValidTime(String time){
		String hr = time.substring(0,2);
		String min = time.substring(3,5);
		String sec = time.substring(6);
		
		int hour = Integer.parseInt(hr);
		int minute = Integer.parseInt(min);
		int second = Integer.parseInt(sec);
		
		if(hour > 23){
			return false;
		}
		if(minute > 60){
			return false;
		}
		
		if(second > 60){
			return false;
		}
		
		return true;
		
	}

}
