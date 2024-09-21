package miscellaneous;

import java.util.LinkedHashMap;
import java.util.Map;

public class CustomSortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//https://leetcode.com/problems/custom-sort-string/description/
		
	    String  order = "bcafg", s = "abcd";
	    
	    System.out.println(customSortString(order,s));
	}

	
	public static String customSortString(String order, String s) {
		
		
/*
1. create a HashMap and store frequency of string s characters
2. create an empty string to store answer
3. iterate over order string, if map contains order then iterate for the number of times
oder character is present and add to answer
4. decrement the value of frequency so that we can track the characters which are not 
present in order
5. now add remaining characters to answer String and iterate over frequency to add all characters
which have same key
		
		
*/
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		 for(int i=0; i<s.length(); i++) {
			 
			 map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
			 
		 }
		
		String ans ="";
		
		for(int i=0; i<order.length(); i++) {
		
		if(map.containsKey(order.charAt(i))){
			
			int frequency = map.get(order.charAt(i));
			
			for( int j=0; j<frequency; j++) {
				
				ans+= order.charAt(i);
				
				map.put(order.charAt(i), map.get(order.charAt(i))-1);
				
			}
			
		}
		}
		
for(char element : map.keySet()) {
			
			if(map.get(element)!=0) {
			int frequecny = map.get(element);
            for(int i=0; i<frequecny; i++){
				ans+= element;
            }
				
			}
		}
		return ans;
        
    }
}