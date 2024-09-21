package Strings;

public class IndexoftheFirstOccurrenceinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/?envType=study-plan-v2&envId=top-interview-150
		
		String haystack = "butsad";
		String needle = "sad";
		
		System.out.println(strStr(haystack,needle));
	}

	
public static int strStr(String haystack, String needle) {
     
	int i=0;
	int j=needle.length();
	
	while(i<=haystack.length() && j<= haystack.length()) {
		
		if(haystack.substring(i,j).equals(needle)) {
			
			return i;
		}
		i++;
		j++;
	}
	return -1;
    
}

}
	
    
