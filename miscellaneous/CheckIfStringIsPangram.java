package miscellaneous;

public class CheckIfStringIsPangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "thequickbrownfoxjumpsoverthelazydog";
		
		System.out.println(isPangram(str));
		
	}
	
	
	public static boolean isPangram(String str) {
		
		str = str.toLowerCase();
		
        int [] count = new int[26];
		
		for(int i=0; i<str.length(); i++) {
			
			count[str.charAt(i)-'a']++;   // a- z , 97-122
			
			//b - a = 1 //y - a = 25 [ subtracting any lower case from a will give result from 0 to 26		 
		}
		
		for(int i=0; i<26; i++) {
			
			if(count[i]<1) {
				return false;
			}
		}	
		return true;

	}

}
