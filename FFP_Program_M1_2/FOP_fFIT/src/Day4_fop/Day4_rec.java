package Day4_fop;

import java.util.Arrays;
import java.util.Scanner;

public class Day4_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter size of arr : ");
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = scn.nextInt();
		}
		
		count(arr);
		
		
	}public static void count(int [] arr){
		Arrays.sort(arr);
		int count =0;
		
		int v
		for(int i=0; i<arr.length-1; i++){
			
			if(arr[i] == arr[i+1]){
				count++;
			}else if(i == arr.length-1){
				count++;
				System.out.println(arr[i] +" occurs " + count + " times");
				count = 0;
			}else{
				count++;
				System.out.println(arr[i] +" occurs " + count + " times");
				count = 0;
			}
			
		}
//		System.out.println(arr[i] +" occurs " + count + " times");
		
	}

}
