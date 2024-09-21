package Arrays;
import java.util.Arrays;

public class ArraysAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 Steps :-
		 1.Create an empty character array of 126 length;
		 2.iterate over the first s and increase character count for all characters
		 present in s
		 3.iterate over the second s1 and decrement character count for all characters
		 present in s1
		 4.now if string is anagram then all characters count should be 0
		 
		 */
		
		String s = "LISTEN";
		String s1 = "SILENT";
		
		
	System.out.println(isAnagram(s,s1));
		
		
	}
	
	public static boolean isAnagram(String s, String s1) {
		int freq[] = new int[126];		
		
		//iterate over loop
		
		for(int i=0; i<s.length(); i++) {
			
			freq[s.charAt(i)]++;
				
		}
        for(int i=0; i<s1.length(); i++) {
			
			freq[s1.charAt(i)]--;
				
		}
        
        for(int i=0;i<126; i++) {
        	
        	if(freq[i]!=0)
        	{
        		return false;
        	}
         }
	
    return true;

	}
}