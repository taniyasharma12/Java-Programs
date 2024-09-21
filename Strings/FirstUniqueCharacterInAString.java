package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//input -> fourbuyfourfrog
		
		//output -> b 4
		
		String str = "fourbuyfourfrog";
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(); 
		 
		for(int i=0; i<str.length(); i++) {
			
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
				
			}
			else {
				
				map.put(str.charAt(i), 1);
			}
		}
		
		for(Character element : map.keySet()) {
			
			if(map.get(element)==1) {
				
				System.out.println(element + " " + map.get(element));
				break;
			}
		}
		
		for(int i=0; i<str.length(); i++) {

			if(map.get(str.charAt(i))==1) {
				System.out.println(i);
				break;
			}
	}
	}
}
