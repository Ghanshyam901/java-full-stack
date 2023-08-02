import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.print("enter the number :- ");
		int num = scn.nextInt();
		
		int ans = isStrongNum(num);
		 if(ans == num){
			 System.out.print( num + " is Strong number :)");
		 }else{
			 System.out.print( num +" is Not Strong Number :( ");
		 }

	}public static int isStrongNum(int num){
		
		int sum = 0;
		
		while(num != 0){
			 int rem = num%10;	 
			 sum +=(factorial(rem));
	         
	         num=num/10;
		}
		
		return sum;
		
		
		
	}public static int factorial(int n){
		int sum = 1;
		while(n != 1){
			sum*=n;
			n--;
		}
		return sum;
	}

}
