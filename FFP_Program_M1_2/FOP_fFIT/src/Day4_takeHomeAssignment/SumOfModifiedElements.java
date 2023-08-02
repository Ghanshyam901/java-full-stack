package Day4_takeHomeAssignment;

import java.util.Scanner;

public class SumOfModifiedElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the size of array :- ");
		int num = scn.nextInt();
		System.out.println("Enter the array of " +num +" size : ");
		int [] arr = new int[num];
		for(int i=0; i<num; i++){
			arr[i] = scn.nextInt();
		}
		
		int ans = getSumOfModifiedElements(arr);
		System.out.print("Outpt is : "+ ans);
		
	}public static int getSumOfModifiedElements(int [] arr){
		
		int sum =0;
		if(arr.length == 0){
			return -1;
		}
		
		for(int i=0; i<arr.length; i++){
			
			if(arr[i] == 0){
				return -3;
			}else if(arr[i] < 0){
				return -2;
			}else{
				if(arr[i] % 2 == 0){
					sum+=arr[i]*2;
				}else{
					sum +=arr[i]/2;
				}
			}
			
		}
		return sum;
		
		
		
	}

}
