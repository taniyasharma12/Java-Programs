package Strings;

public class CanAStringFormPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(canFormPalindrome("madama"));
	
	} 

	public static boolean canFormPalindrome(String str) {
		
		
		int char_count[] = new int[128];
		
		for(int i=0; i<str.length(); i++) {
			
			char_count[str.charAt(i)]++;
		}
		
		int count =0;
		
		for(int i=0; i<128; i++) {
			
          count +=char_count[i]%2;
		}
		
		if(count>1) {
			return false;
		}
		return true;
	}
}

