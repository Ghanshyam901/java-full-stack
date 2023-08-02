package Day_5_oops_TakeHome_Assignment;

public class Validator {
	
	public boolean validatePassword(String password) throws Exception{
		 
		if(password.contains(" ") || password.length() < 8){
			throw new WrongPasswordException("WrongPasswordException");
		}
		
		int capitalLetter =0;
		int smallLetter = 0;
		int num =0;
		int symbol =0;
		
		for(int i=0; i<password.length(); i++){
			char ch = password.charAt(i);
			if(Character.isLowerCase(ch)){
				smallLetter++;
			}else if(Character.isUpperCase(ch)){
				capitalLetter++;
			}else if(Character.isDigit(ch)){
				num++;
			}else{
				symbol++;
			}
		}
		
		if(capitalLetter >=1 && smallLetter >=2 && symbol >=1 && num >=1 && (smallLetter > capitalLetter)){
			return true;
		}else{
			throw new WrongPasswordException("WrongPasswordException");
		}

		
	}
}
