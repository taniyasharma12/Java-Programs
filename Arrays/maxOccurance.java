package Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class maxOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getMaxOccuringChar("aabbccccddddttttttttttt"));
	}

	 //Function to find the maximum occurring character in a string.
	    public static char getMaxOccuringChar(String str) {
	    	
	    	char maxChar = Character.MIN_VALUE;
	    	int maxfreq = Integer.MIN_VALUE;
	    	
	    	Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
	    	
	    	for(int i=0; i<str.length(); i++) {
	    		
	    		if(map.containsKey(str.charAt(i))) {
	    			map.put(str.charAt(i), map.get(str.charAt(i))+1);
	    		}
	    		else {
	    			map.put(str.charAt(i), 1);
	    		}
	    	}
	    	
	    	for(Character key : map.keySet()) {
	    		
	    		if(map.get(key)>maxfreq) {
	    			maxfreq=map.get(key);
	    			maxChar = key;
	    		}
	    	}
	    	
	    	return maxChar;
	    }


}
