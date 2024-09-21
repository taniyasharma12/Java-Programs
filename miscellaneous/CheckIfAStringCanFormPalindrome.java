package miscellaneous;

public class CheckIfAStringCanFormPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(canFormPalindrome("aaa"));
	}

	//madam , aaaa, racecar, nitin
	
	//all even one odd, all even, all even one odd, all even one odd
	
	/*so for a string to be palindrome, count of each character should be even
	  or count count of each character should be even and only 1 character should
	  have odd count
	  
	  Steps :-
	  
	  1. make a frequecny array and add count of each character in it
	  2. take modulus of each character with 2 , if 0 that means character count is even
	  3. if modulus not 0 add to count if count >1 it means more then 1 character count is odd
	
	*/
	public static boolean canFormPalindrome(String str) {

		int count =0;
		
		int char_count [] = new int[128];
		
		for(int i=0; i<str.length(); i++) {
			
			char_count[str.charAt(i)]++;
			
		}
		
		for(int i=0; i<128; i++) {
			
			count += char_count[i]%2;
			
		}
		
		if(count>1) {
		return false;
		}
		return true;
	}
	
}
