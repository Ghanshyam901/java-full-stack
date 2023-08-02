package Day6_w2_guided_assignmnet;

import java.util.Scanner;

public class Print_multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter num : ");
		int n = scn.nextInt();
		
		printMul(n);

	}public static void printMul(int num){
		
		for(int i=1; i<=num; i++){
			
			for(int j=1; j<=10; j++){
				System.out.println(i+" * " +j+" = "+ i*j );
			}
			System.out.println( "---------------");
		}
	}

}
