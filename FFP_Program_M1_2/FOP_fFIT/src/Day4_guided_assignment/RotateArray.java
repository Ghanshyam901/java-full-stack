package Day4_guided_assignment;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the size of array : ");
		int n = scn.nextInt();
		int [] arr = new int [n];
		System.out.print("Enter the k value : ");
		int k = scn.nextInt();
		System.out.print("Enter array of value : ");
		for(int i=0; i<n; i++){
			arr[i] = scn.nextInt();
		}
		
		int [] ans = rotate(arr, k);
		
	
			for(int i=0; i<n; i++){
				System.out.print(ans[i]+" ");
			}
		
		
		
		
		
		
	}public static int [] rotate(int [] arr , int k){
		
		int n = arr.length;
		k = k%n;
		
		swap(n-k,n-1,arr);
		swap(0,n-k-1,arr);
		swap(0,n-1, arr);
		
		
		return arr;
		
	}public static void swap(int i, int j, int [] arr){
		while(i < j){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j]= temp;
			i++;
			j--;
		}
	}

}
