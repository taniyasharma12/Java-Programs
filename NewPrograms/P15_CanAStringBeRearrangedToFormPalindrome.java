package NewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class P15_CanAStringBeRearrangedToFormPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//can be rearranged to form a palindrome when either all letters are in event count
				//or all letters in even count + one in odd
				//so basically count % 2 should be <=1;
		String str = "aabbcbbaaddd";
		System.out.print(canFormPalindrome(str));
	}
	
	public static boolean canFormPalindrome(String str) {
		
		int [] char_count = new int[128];
		
		int count =0;
		
		for(int i =0; i< str.length(); i++) {
			char_count[str.charAt(i)]++;
		}
		
		for(int i=0 ; i<128; i++) {
			count = count + char_count[i]%2;
		}
		
		if(count>1) {
			return false;
		}
		return true;
	}
}
		
