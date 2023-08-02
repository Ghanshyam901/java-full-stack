package Day5_Fop;

import java.util.Scanner;

public class maxInMatrix {
	public static void main(String [] args){
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter row and col :- ");
		int r  = scn.nextInt();
		int c = scn.nextInt();
		
		int [][] mat = new int[r][c];
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				mat[i][j] = scn.nextInt();
			}
		}
		
		maxInMatrixArray(mat);
		
		
	}public static void maxInMatrixArray(int [][] mat){
		
		for(int [] arr : mat){
			int max = 0;
			for(int m : arr){
				max = Math.max(max, m);
			}
			System.out.println("max is "+max);
			
		}
	}public static void maxInMatrixArray_2(int [][] mat){
		
		int max = 0;
		for(int [] arr : mat){
			for(int m : arr){
				max = Math.max(max, m);
			}
		}
		System.out.println("max is "+max);
	}
}
