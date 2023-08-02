package Day5_Fop;

import java.util.HashSet;
import java.util.Scanner;

public class DistnictElementSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number :- ");
		int num = scn.nextInt();
		
		int [] arr = new int[num];
		for(int i=0; i<num; i++){
			arr[i] = scn.nextInt();
			
		}
		int ans = getSumOfDistinctElements(arr);
		
		System.out.print(ans);
		
	}public static int getSumOfDistinctElements(int [] arr){
		int sum = 0;
		HashSet<Integer> set = new HashSet<>();
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] < 0){
				return -1;
			}
			if(arr[i] == 0) return -2;
			if(!set.contains(arr[i])){
				sum+=arr[i];
				set.add(arr[i]);
			}else{
				sum-=arr[i];
			}
		}
		
		return sum;
		
	}

}
