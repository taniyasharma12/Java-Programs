package SlidingWindowFixedSize;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurencesOfAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aabaabaa";
        String p = "aaba";
        
        System.out.println(anagram(s,p));
	}

	
	public static int anagram(String s, String p) {
		
		int start =0;
		int end =0;
		int k = p.length();
		int ans =0;
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		

		char st [] = s.toCharArray();
		
		for(int i=0; i<p.length(); i++) {
			
			if(map.containsKey(p.charAt(i))) {
				map.put(p.charAt(i), map.get(p.charAt(i))+1);
			}
			else {
				map.put(p.charAt(i), 1);
			}
		}
		int count=map.size();

		
		while(end< s.length()) {
			
			if(map.containsKey(st[end])) {
				map.put(st[end], map.get(st[end])-1);
				
				if(map.get(st[end])==0) {
					count--;
				}
			}
			
			if(end -start+1<k) {
				end++;
			}
			else if(end-start+1==k) {
				
				if(count==0) {
					
					ans++;
				}
				if (map.containsKey(st[start])) {
                    map.put(st[start], map.get(st[start]) + 1);
                    if (map.get(st[start]) == 1) {
                        count++;
                    }
                }

                start++;
                end++;
            }

        }

        return ans;

    }
}


