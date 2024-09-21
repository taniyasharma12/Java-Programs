package miscellaneous;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FindAllAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://leetcode.com/problems/find-all-anagrams-in-a-string/
		String s = "aa";
		String p = "bb";
		
		
		findAnagrams(s,p);

	}
    public static List<Integer> findAnagrams(String s, String p) {
        
    	ArrayList<Integer> list = new ArrayList<Integer>();

        int i=0;
    	int j=0;
    	int k= p.length();
    	Map<Character,Integer> map =new LinkedHashMap<Character,Integer>();
    	
    	for(int x=0; x<p.length(); x++) {
    		
    		map.put(p.charAt(x), map.getOrDefault(p.charAt(x), 0)+1);
    		
    	}
    	
    	int count = map.size();
    	while(j<s.length()) {
    		
    		if(map.containsKey(s.charAt(j))){
    			
    			map.put(s.charAt(j), map.get(s.charAt(j))-1);
    			
    			if(map.get(s.charAt(j))==0) {
    				
    				count--;
    			}
    		}
    		
    		if(j-i+1<k) {
    			
    			j++;
    		}
    		else if(j-i+1==k) {
    			
    			if(count==0) {
    				
    				list.add(i);
                    anagramCount++;
    			}
    			if(map.containsKey(s.charAt(i))) {
    				
    				map.put(s.charAt(i), map.get(s.charAt(i))+1);
    				if(map.get(s.charAt(i))==1) {
    					count++;
    				}
    			}
    			
    			i++;
    			j++;
    		}
    	}

if(anagramCount==0){

    list.clear();
}
  System.out.println(list);  	
  
  System.out.println(anagramCount);  	

return list;	
      }
  }