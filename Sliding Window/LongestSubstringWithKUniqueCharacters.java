package SlidingWindowVariableSize;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithKUniqueCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabacbebebe";
		
		int k =3;
		
		System.out.println(longestsubstringWithKUniqueCharacters(str,k));
		
	}
	
/*
 Take 2 pointers i and j , max variable to store max length
 Create a HashMap to store character and key and its frequency as value
 iterate while j < str.length , map.put values
 if map.size()<k then j++
 if map.size() == k that means all characters are unique so calculate max
 else while map.size()>k decrement ith element from map and remove if frequency is 0
 
 */

	
	public static int longestsubstringWithKUniqueCharacters(String str, int k) {
		
		int i=0;
		int j=0;
		int max=0;
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		while(j<str.length()){
			
			map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0)+1);
			
			if(map.size()<k) {
				
				j++;
			}
			
			else if(map.size()==k) {
				
				max = Math.max(max, j-i+1);
				j++;
			}
			else {
				while(map.size()>k) {
					
				if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.getOrDefault(str.charAt(i),0)-1);
				}
				if(map.get(str.charAt(i))==0) {
					
					map.remove(str.charAt(i));
				}
				i++;
			}
              j++;
		}
			}
		return max;
		
	}
}
	
