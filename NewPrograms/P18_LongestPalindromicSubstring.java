package NewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class P18_LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create method isPalindrome
		//check if substring is palindrome
		//if yes add the substring and its length in a hashmap
		//the print the map key with the max length
		String str = "qqdddffvvvvv";
		solution(str);
	}
	
	public static void solution(String str)
	{
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		for(int i=0; i<str.length(); i++) {
			for(int j=i+1; j<str.length(); j++) {
				if(isPalindrome(str.substring(i, j))) {
					map.put(str.substring(i, j), str.substring(i, j).length());
				}
			}
		}
				int max = Integer.MIN_VALUE;
				for(String key : map.keySet() ) {
					if(map.get(key)>max)
					{
						max = map.get(key);
					}
				}
				for(String key : map.keySet() ) {
				if(map.get(key)==max){
					System.out.println(max + " " + key);
				}
			}
			
	}
	public static boolean isPalindrome(String str) {
		
		int i=0;
		int j=str.length()-1;
		
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)){
				return false;
			}
			i++;
			j--;
			}
		return true;
	}
	}