package Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class CounttheNumberofConsistentStringsLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://leetcode.com/problems/count-the-number-of-consistent-strings/description/
		
		String allowed = "ab";
		String words [] = {"ad","bd","aaab","baa","badab","ab", "ba", "ababc"};
		
		System.out.println(countConsistentStrings(allowed, words));
	}

public static int countConsistentStrings(String allowed, String[] words) {
	
	/*
	 iterate over each element of words to check if allowed contains all character present in word
	 
	 */
	boolean present = false;
	int count=0;
	for(int i=0; i<words.length; i++) {
		
		String word = words[i];
		
	for(int j=0; j<word.length(); j++) {
		
		if(allowed.contains(word.charAt(j)+"")) {
			
			present = true;
			
		}
		else {
			
			present  = false;
			break;
		}
	}
	if(present==true) {
	count++;
	
	}
		}
	return count;
}
}