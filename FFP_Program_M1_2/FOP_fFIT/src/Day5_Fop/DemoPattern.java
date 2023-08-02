package Day5_Fop;

import java.util.Scanner;

public class DemoPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter row and col :- ");
		int r  = scn.nextInt();
//		int c = scn.nextInt();
		
		printPattern_9(r);

	}public static void printPattern(int r){
		
		for(int i=0; i<r; i++){
			for(int j=0; j<=i; j++){
				System.out.print("1 ");
			}
			System.out.println();
		}
	}public static void printPattern_3(int r){
		
		int p=1;
		for(int i=0; i<r; i++){
			for(int j=0; j<=i; j++){
				System.out.print(p+" ");
				p++;
			}
			System.out.println();
		}
	} public static void printPattern_4(int r){
	
		for(int i=1; i<=r; i++){
			for(int j=1; j<=i; j++){
				System.out.print((i*j) +" ");
//				p++;
			}
			System.out.println();
		}
	}
		public static void printPattern_5(int r){
			
			int k = 1;
			for(int i=1; i<=r; i++){
				for(int j=1; j<=i; j++){
					System.out.print((k*2) +" ");
					k++;
				}
				System.out.println();
			}
		}public static void printPattern_6(int r){
			
			
			for(int i=0; i<r; i++){
				for(int j=0; j<r; j++){
					if((i+j)% 2 == 0){
						System.out.print("* ");
					}else{
						System.out.print("# ");
					}
					
					
				}
				System.out.println();
			}
		}public static void printPattern_7(int r){
			
			int mid = r/2;
			
			for(int i=0; i<r; i++){
				
				for(int j=0; j<r; j++){
					if(i == 0 || j == 0 || i == r-1 || j == r-1){
						System.out.print("1 ");
					}else if(i == mid && j == mid){
						if(r%2 != 0)System.out.print("* ");
						else{
							System.out.print("0 ");
						}
					}else{
						System.out.print("0 ");
					}
					
				}
				System.out.println();
			}
		}public static void printPattern_8(int r){
			
			
			for(int i=r-1; i>=0; i--){
				for(int j=r; j>=i; j--){
					System.out.print("* ");
				}
				System.out.println(" ");
			}
		}
       public static void printPattern_9(int r){
			
    	   for(int i=0; i<r; i++){
    		   char ch = 'A';
    		   for(int j=0; j<=i; j++){
    			   System.out.print(ch+" ");
    			   ch++;
    		   }
    		   System.out.println();
    	   }
			
			
		}
		
	

}
