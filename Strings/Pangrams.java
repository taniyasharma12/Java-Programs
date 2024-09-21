package Strings;
import java.util.Arrays;

public class Pangrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "The quick brown fox jumps over the lazy dog";
		
		System.out.print(isPangrams(str));
	}
		//create an integer array of 128 characters
		//increase count of each char in array
		// A-Z is index 65-90 
		//check array 65 to 90, no value should be 0
		
		public static boolean isPangrams(String str) {
		str = str.toUpperCase();
		int char_count[] = new int[128];
		
		for(int i=0; i<str.length(); i++) {
			
			char_count[str.charAt(i)]++;
		}
		
		for(int i=65; i<=90; i++) {
			if(char_count[i]==0) {
				
			return false;
			}
		}
		return true;
	}
}