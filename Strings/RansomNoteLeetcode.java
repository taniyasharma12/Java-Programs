package Strings;

public class RansomNoteLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://leetcode.com/problems/ransom-note/?envType=study-plan-v2&envId=top-interview-150
		
		
		
		/*
		 Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
         Each letter in magazine can only be used once in ransomNote. 
		 */
		
		String ransomNote = "aa"; 
		String magazine = "aab";
		
		
		System.out.print(canConstruct(ransomNote,magazine));
	}

public static boolean canConstruct(String ransomNote, String magazine) {
	
	
	int count [] = new int[126];
	
	for(int i=0; i<magazine.length(); i++) {
		
		
		count[magazine.charAt(i)]++;
	}
	
for(int i=0; i<ransomNote.length(); i++) {
		
		
		count[ransomNote.charAt(i)]--;
	
	
if(count[ransomNote.charAt(i)]<0) {
	
	return false;
}
}
	return true;
       
    }

}
