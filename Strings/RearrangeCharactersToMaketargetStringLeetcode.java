package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class RearrangeCharactersToMaketargetStringLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcbaabcsabc";
		String target = "abc";
		
		System.out.println(rearrangeCharacters(s,target));
		

	}
	public static int rearrangeCharacters(String s, String t) {
	       
	       int ans =Integer.MAX_VALUE;
	       Map<Character, Integer> maps = new LinkedHashMap<Character, Integer>();
	       
	       for(int i=0; i<s.length(); i++){
	       maps.put(s.charAt(i),maps.getOrDefault(s.charAt(i),0)+1)  ;
	        }
	       
	       Map<Character, Integer> mapt = new LinkedHashMap<Character, Integer>();

	        for(int i=0; i<t.length(); i++){
	       mapt.put(t.charAt(i),mapt.getOrDefault(t.charAt(i),0)+1)  ;
	        }
	        
	        for(char element : mapt.keySet()) {
	        	
	        	if(!maps.containsKey(element))
	                return 0;

	            if(mapt.get(element) > maps.get(element))
	            {
	                return 0;
	            }
	        		
	            else {
	        		ans = Math.min(ans, maps.get(element)/mapt.get(element));
	        	}
	        	
	        }
			return ans;
	}
}