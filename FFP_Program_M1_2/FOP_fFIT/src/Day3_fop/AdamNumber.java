package Day3_fop;

import java.util.Scanner;

public class AdamNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number -: ");
		
		int num = scn.nextInt();
		
		boolean ans = isAdamNum(num);
		System.out.print(ans);
		

	}public static boolean isAdamNum(int num){
		
		int square1 = getSqure(num);
		int rev = revNumber(num);
		int square2 = getSqure(rev);
		
		if(square1 == revNumber(square2)){
			return true;
		}
		return false;
		
	}
	public static int getSqure(int num){
		return  num * num;
	}
	public static int revNumber(int num){
		int rev = 0;

        while(num != 0){
            int rem = num%10;
            rev = rev*10+rem;
            num=num/10;
        }
        return rev;
	}

}
