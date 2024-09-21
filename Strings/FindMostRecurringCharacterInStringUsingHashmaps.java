package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindMostRecurringCharacterInStringUsingHashmaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "aaaaaabbbbbeeeeeeeeeeeeeeeeeeeeeqeweferef";
		
		char ch[] = str.toCharArray();
		
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		
		for(int i=0; i<ch.length; i++) {
			
			if(map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i])+1);
			}
			else {
				map.put(ch[i], 1);
			}
		}
		
		int max = Integer.MIN_VALUE;
		
		for(Character element : map.keySet()) {
			
			if(map.get(element)>max) {
				
				max = map.get(element);
			}
			
		}
		
		System.out.println(max + " "+ ch[max]);

	}

}
