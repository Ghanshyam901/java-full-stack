package Day3_takeHomeAssignment;

import java.util.Scanner;

public class SecondMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number :-  ");
		int num = scn.nextInt();
		
		int ans = secondMaxNum(num);
		System.out.print(ans);

	}public static int secondMaxNum(int num){
		if(num < 0){
			return -1;
		}
		
		int fmax = Integer.MIN_VALUE;
		int smax = fmax;
		
		while(num != 0){
			int rem = num%10;
			if(rem > fmax){
				smax = fmax;
				fmax = rem;
			}else if(rem <= fmax && rem >= smax){
				smax = rem;
			}else{
				
			}
			num = num/10;
		}
		
		if(smax == Integer.MIN_VALUE){
			return -1;
		}else if(fmax == smax){
			return 0;
		}else{
			
		}
		
		return smax;
	}

}
