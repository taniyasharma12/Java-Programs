package Strings;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortThePeopleLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String names [] = {"Mary","John","Emma"};
		int heights [] = {180,165,170};

		System.out.println(sortPeople(names,heights));
		
	}

public static String sortPeople(String[] names, int[] heights) {
        
        
        Map<Integer, String> map = new LinkedHashMap<Integer,String>();
        
        for(int i=0 ; i<heights.length; i++) {
        	
        	map.put(heights[i],names[i]);
        	
        }
        String result [] = new String[names.length];
        Arrays.sort(heights);
        
        for(int i=heights.length-1; i>=0; i--) {
        	
        	result[heights.length-i-1] = map.get(heights[i]);
        	
        	//System.out.println(result[i]);
        }
        
		return Arrays.toString(result);
    }
}

