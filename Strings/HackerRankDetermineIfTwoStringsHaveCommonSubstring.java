package Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class HackerRankDetermineIfTwoStringsHaveCommonSubstring {

	
	public static void main(String args[]) {

		
		//https://www.hackerrank.com/challenges/two-strings/problem
		
		String s1 ="catryyyyyyyyyyyy";
		
		String s2 = "tjjhywg";
		
		System.out.println(twoStrings(s1, s2));
		
	}
	
	public static String twoStrings(String s1, String s2) {
		
		boolean flag = false;
		for(int i=0; i<s1.length(); i++){
		
			if(s2.contains(s1.charAt(i)+"")) {
				
				flag = true;
				break;
				
			}
		}
			
			/*
		}
		
		Set<Character> st1 = new LinkedHashSet<Character>();
		
		 Set<Character> st2 = new LinkedHashSet<Character>();
		  
		
		for(int i=0; i<s1.length(); i++) {
			
			st1.add(s1.charAt(i));
		}
	    
         for(int i=0; i<s2.length(); i++) {
			
			st2.add(s2.charAt(i));
		}
         
         //The retainAll() method of java.util.Set interface is used to retain from this set all 
         //of its elements that are contained in the specified collection.
	   st1.retainAll(st2);
	   
	   if(st1.isEmpty()) {
	    	return "NO";
	    }
	   */
		if(flag) {
	   return "YES";
}
		return "NO";
}
}

