import java.util.Scanner;

public class ReverseNum {
	public static void main(String[] args){
		 Scanner scn = new Scanner(System.in);
	        System.out.print("enter input :- ");
	        int num = scn.nextInt();

	        int rev = 0;

	        while(num != 0){
	            int rem = num%10;
	            rev = rev*10+rem;
	            num=num/10;
	        }
	        System.out.println(rev);
	}
}
