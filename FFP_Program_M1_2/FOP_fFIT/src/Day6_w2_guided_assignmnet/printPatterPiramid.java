package Day6_w2_guided_assignmnet;

import java.util.Scanner;

public class printPatterPiramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("enter num : ");
		int num = scn.nextInt();
		
		printPiramid(num);
		
	}public static void printPiramid(int num){
		
		
		int space2 = 0;
		int star2 = num;
		
		for(int i=0; i<num; i++){
			for(int j=1; j<=space2; j++){
				System.out.print(" ");
			}
			
			for(int j=0; j<star2; j++){
				System.out.print("* ");
			}
			
		
			System.out.println();
			space2++;
			star2--;
			
			if(star2 == 1)break;
			
		}

		int space = num-1;
		int star = 1;
		
		for(int i =0; i<num ;i++){
			
			for(int j=1; j<=space; j++){
				System.out.print(" ");
			}
			
			for(int j=1; j<=star; j++){
				System.out.print("* ");
			}
			
			star+=1;
			space--;
			System.out.println();
		}
		
	}

}
