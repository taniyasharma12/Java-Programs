package NewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestRepeatingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abdfaabdfh";
		allSubStrings(s);

	}
	
	
	public static void allSubStrings(String str) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(map.containsKey(str.substring(i, j))) {
				map.put(str.substring(i, j), map.get(str.substring(i, j))+1);
			}
			else {
				map.put(str.substring(i, j), 1);
	
			}
			
			}
		}
		int max = Integer.MIN_VALUE;
		String maxString = "";
		
		for(String key: map.keySet()) {
			
			if(map.get(key)>1) {
				if(key.length()>max) {
					maxString = key;
					max = key.length();
				}
			}
	}
		for(String key: map.keySet()) {
			if(key==maxString) {
				System.out.println(key);
			}
	}

}
	}
