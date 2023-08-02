package Day4_takeHomeAssignment;

import java.util.Scanner;

public class BoxPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter row :- ");
		int row = scn.nextInt();
		System.out.print("Enter col :- ");
		int col = scn.nextInt();
		
		if(row < 0 || col < 0){
			System.out.print("-1");
		}else if(row == 0 || col == 0){
			System.out.print("-2");
		}else{
			createBoxPattern(row, col);
		}

	}public static void createBoxPattern(int row, int col){
		
		for(int i=0; i<row; i++){
			
			for(int j=0; j<col; j++){
				if(i == 0 || j == 0 || i == row-1 || j == col-1){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
			
		}
	}

}
