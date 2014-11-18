package arrays;

public class StrUtils {
 
	int countChars(String s) {
		
		int count = 0;
		
		for(int i = 0; i < s.length(); i++){
			
			// nur buchstaben zählen
			if (Character.isLetter(s.charAt(i))){
			count++;
			
		}
		
		return count;
	
	}

  }
}