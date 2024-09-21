package Strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindCommonCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://leetcode.com/problems/find-common-characters/description/
		
		String words[] = {"cool","lock","cook"};
		System.out.println(commonChars(words));
		
	}
		
	/*
	 
	 Create a Map and store frequency all characters of first word in that map
	 Create another Map and store frequencies of all other words in it
	 check if map 1 key is present in map 2 if yes take the minimum value of it
	 add this value in a list
	 
	 */
	public static List<String> commonChars(String words[]){
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		
        // count the frequency of each character for first word

		for(Character ch : words[0].toCharArray())
		{
			
		map.put(ch, map.getOrDefault(ch,0)+1);
		
		}
       // loop through the rest of words and compare with the first word

		for(int i=1; i<words.length; i++) 
		{
			
			Map<Character,Integer> tempMap = new LinkedHashMap<Character,Integer>();
			
			for(Character ch : words[i].toCharArray()) {
				
				tempMap.put(ch, tempMap.getOrDefault(ch,0)+1);
				
				
			}
			
			// if the character in first word is not in other words, then make it 0
            // else we put the min frequency

			for(Character ch : map.keySet()) {
				
				if(!tempMap.containsKey(ch)) {
					
					map.put(ch, 0);
				}
				else {
					
					map.put(ch, Math.min(map.get(ch), tempMap.get(ch)));
					
				}
				
			}
			
		}        // last step is simply printing out the result

			List<String> list = new ArrayList<String>();
				
				for(Character  ch : map.keySet()) {
					int count = map.get(ch);
					while(count>0) {

					list.add(String.valueOf(ch));
			        count--;

					}
				}
	
	
		return list;
	}
}