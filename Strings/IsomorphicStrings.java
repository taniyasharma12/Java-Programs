package Strings;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "bac";
				
		String t = "baa";
		
		System.out.println(isIsomorphic(s,t));
				
	}

public static  boolean isIsomorphic(String s, String t) {
	
/*
1. Create a HashMap of Character from s and Character from t
2. Take two variables original for character from s and replacement for character from t 
3. If map containsKey original char, then check if value mapped to key is replacement if not return false;
4. If does not contain key (original char) check if map contains replacement char if
yes return false if not add the original,replacement is map
*/
	
	HashMap<Character,Character> map = new LinkedHashMap<Character,Character>();
	
	   for(int i=0; i<s.length(); i++) {
		   
		   char original = s.charAt(i);
		   char replacement = t.charAt(i);
		   
		   if(map.containsKey(original)) {
			   
			   if(map.get(original)!=replacement) {
				   return false;
			   }
		   }
		   else {
			   
			   if(!map.containsValue(replacement))
			   {
				   
                map.put(original, replacement);   	  
                
			   }  
			   else {
				   return false;
			   }
		   }
		   
	   }
	return true;
	
}
}