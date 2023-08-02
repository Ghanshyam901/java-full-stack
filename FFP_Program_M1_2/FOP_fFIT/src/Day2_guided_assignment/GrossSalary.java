package Day2_guided_assignment;

import java.util.Scanner;

public class GrossSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("HRA AMOUNT -: ");
		int hra = scn.nextInt();
		
		System.out.println("Enter PF amount -: ");
		int pf = scn.nextInt();
		
		int deduction = hra+pf;
		System.out.print("your anual salary :- ");
		
		int anualSalary = scn.nextInt();
		
		int taxableIncome = anualSalary-deduction;
		
		System.out.print("your taxable anual amount is : - "+ taxIncome(taxableIncome) );
		
		
	}public static int taxIncome(int taxtaxableIncome){
		
		if(taxtaxableIncome <= 500000){
			return taxtaxableIncome * 10/100;
		}else if(taxtaxableIncome > 500000 && taxtaxableIncome <= 1000000){
			return taxtaxableIncome * 20 /100;
		}else{
			return taxtaxableIncome * 30 /100;
		}
		
	}

}
