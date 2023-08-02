package Day5_Fop;

import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter value :- ");
		int num = scn.nextInt();
		
//		double res = FahrenheitToCelsius(num);
//		System.out.print(res);
		
		int ans = CelsiusToFahrenheit(num);
		System.out.print(ans);
		
	}public static double FahrenheitToCelsius(int far){
		
		return (far-32)*5/9;
	}public static int CelsiusToFahrenheit(int cel){
		return cel*9/5+32;
	}

}
