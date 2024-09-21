package NewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class P16_HashMapFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbbbccddddddfffe";
		
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
			System.out.println(key + " " + map.get(key));
		} 
		
	}
}
