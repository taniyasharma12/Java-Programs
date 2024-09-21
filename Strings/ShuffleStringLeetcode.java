package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShuffleStringLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "codeleet";
		
		int indices[] = {4,5,6,7,0,2,1,3};
		
		restoreString(s, indices);
		
		
	}
	

	
	
	
	//getOrDefault(Object key, V defaultValue) --not related to question
	
	
	public static String restoreString(String s, int[] indices) {
	
	String ans = "";
	Map<Integer, Character> map = new LinkedHashMap<Integer,Character>();
	
	for(int i=0; i<indices.length; i++) {
	map.put(indices[i], s.charAt(i));
	
	}
	System.out.println(map);
	for(int i=0; i<indices.length; i++) {
		
		ans += map.get(i);
	}
	
	System.out.println(ans);	
	return s;
        
    }
}