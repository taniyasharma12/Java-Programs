package SlidingWindowVariableSize;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://www.youtube.com/watch?v=L6cffskouPQ&list=PL_z_8CaSLPWeM8BDJmIYDaoQ5zuwyxnfj&index=11
		
		String str = "abcdefabcbb";
		
		System.out.println(longestSubstringWithoutRepeatingCharacters(str));

	}
/*
 Take 2 pointers i and j , variable max to store max length of substring
 Create a Hashmap to store character and frequency
 while j<str.length put elements in map
 if map.size()==j-i+1 then calculate max as all unique characters in string then j++
 else if map.size()<j-i+1 then while map.size()<j-i+1n then decrease frequency for ith element
 increment i and j
 return max
 
 
 
 */
	public static int longestSubstringWithoutRepeatingCharacters(String s) {
		
		int i=0;
		int j=0; 
		int max=0;
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
		while(j<s.length()) {
			
			map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0)+1);
			
			if(map.size()==j-i+1) {
				
				max = Math.max(max, j-i+1);
				j++;
			}
			
			else if(map.size()<j-i+1) {// this means repeated characters are present
				
				while(map.size()<j-i+1) {
					
					map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
					
					if(s.charAt(i)==0) {
						
						map.remove(s.charAt(i));
					}
					i++;
				}
				j++;
			}
		}
		return max;
	}
	
}
