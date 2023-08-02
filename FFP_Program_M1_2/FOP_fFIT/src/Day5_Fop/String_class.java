package Day5_Fop;

import java.util.Scanner;

public class String_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter string : ");
		String st = scn.nextLine();
		
		getVowels(st);

	}public static void getVowels(String st){
		
		int vo =0;
		int co = 0;
		int sp = 0;
		int dig = 0;
		
		for(int i=0; i<st.length(); i++){
			char ch = st.charAt(i);
			if(ch =='a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u'){
				vo++;
			}else if(ch ==' '){
				sp++;
			}else if(ch >=0 && ch <='9'){
				dig++;
			}else{
				co++;
			}
		}
		
		System.out.println("vowel is "+vo);
		System.out.println("Constant is "+co);
		System.out.println("Space is "+sp);
		System.out.println("Digit is "+dig);
		
	}

}
