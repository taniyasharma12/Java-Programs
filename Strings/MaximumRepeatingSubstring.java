package Strings;

import java.util.Arrays;

public class MaximumRepeatingSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sequence = "ababcab";
		String word = "ab";
		
		System.out.println(maxRepeating(sequence, word));
		
		
	}
		
public static int maxRepeating(String sequence, String word) {
	
	int count =0;
	
	String str = word;
	
	while(sequence.contains(str)) {
		
		str +=word;
		count++;
		
	}
return count;    
    }
}

	

	
	
	

