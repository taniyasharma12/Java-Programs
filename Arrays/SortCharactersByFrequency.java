package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "tree";
		//eert
		System.out.println(frequencySort(s));
				
		//https://leetcode.com/problems/sort-characters-by-frequency/
	}

	
public static String frequencySort(String s) {
       
	//convert string to array and create frequency hashmap
	char ch [] = s.toCharArray();
	
	Map<Character, Integer> map = new LinkedHashMap<Character,Integer>();
	
	for(int i=0; i<ch.length; i++) {
	if(map.containsKey(ch[i])){
		
		map.put(ch[i], map.get(ch[i])+1);
	}
	else {
		
		map.put(ch[i], 1);
	}
    }
	
	//create a non primitive array since comparator does on work on primitive
	
	Character arr []= new Character[ch.length];
	
	for(int i=0; i<arr.length; i++) {
		
		arr[i] = ch[i];
	}
	
    Arrays.sort(arr, (a, b) -> {
        if (map.get(a) != map.get(b)) {
            // if freq of numbers are not equal then return in increasing order based on
            // freq.
            return map.get(b) - map.get(a);
        } else {
            // otherwise sort them in decreasing order based on number in nums.
            return a - b;
        }
    });

    String str="";
for(int i=0; i<arr.length; i++) {
		
		str+=arr[i];
	}

return str;
}
}







