package Day6_w2_fop;

import java.util.Scanner;

public class CountVowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the string : ");
		
		String str = scn.nextLine();
		countVowelsAnsConst(str);

	}public static void countVowelsAnsConst(String str){
		
		int const_ = 0;
		int vol_ = 0;
		
		for(int i=0; i<str.length(); i++){
			char ch = str.charAt(i);
			
			if(ch =='a'|| ch=='e' || ch == 'i' || ch == 'o' || ch =='u' || ch =='A' || ch =='E' || ch =='I' || 
					ch =='O'|| ch =='U'){
				vol_++;
			}else{
				const_++;
			}
		}
		
		System.out.println("Vowel : "+ vol_);
		System.out.println("Constant : "+ const_);
		
	}

}
