package NewPrograms;

import java.util.Map;
import java.util.LinkedHashMap;

public class P10_FirstNonRepeatingCharacterInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// input -> aabbcddef
		// output -> c
		
		String str = "aabbcddef";
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
			if(map.get(key)==1) {
				System.out.println(key+ " " +map.get(key));;
				break;
			}
		}
	}
}






