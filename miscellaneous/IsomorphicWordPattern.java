package miscellaneous;

import java.util.LinkedHashMap;
import java.util.Map;

public class IsomorphicWordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String  pattern = "abba";
		String s = "dog cat cat dog";
		
		System.out.println(wordPattern(pattern,s));
		
	}

	public static boolean wordPattern(String pattern, String s) {
		
/*https://leetcode.com/problems/word-pattern/
1. Create a HashMap of Character and String
2. Take two variables original for character and replacement for corresponding string
3. If map containsKey original char, then check if value mapped to key is replacement is 
replacement if not return false;
4. If does not contain key (original char) check if map contains replacement string if
yes return false if not add the original,replacement is map
*/      
		String [] str = s.split(" ");
		
        if(pattern.length()!=str.length)
        {
              return false;
        }
        
		Map<Character,String> map = new LinkedHashMap<Character,String>();
				
		for(int i=0; i<pattern.length(); i++) {
			
			char original = pattern.charAt(i);
			
		    String replacement = str[i];
		    
		    if(map.containsKey(original)) {
		    			    	
		    	if(!map.get(original).equals(replacement)) {	

		    		return false;    		
		    	}
		    }
		    	else {
		    		
		    		if(map.containsValue(replacement)) {
		    			
		    			return false;
		    		}
		    		else {
		    			
		    			map.put(original, replacement);
		    		}	    		
		    		
		    	}
		    	
		    }
		
			return true;
	
	}
}
