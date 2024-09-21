package BasicJavaPrograms;

public class PalindromeLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://leetcode.com/problems/valid-palindrome/?envType=study-plan-v2&envId=top-interview-150
		
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
	}
	
	public static boolean isPalindrome(String s) {
        
		 s = s.toLowerCase();
	      if(s==null || s.length()<=1)
	{
	    return true;
	}
	  int start =0;

	  int end = s.length()-1;

	while(start<=end){

		if(!Character.isLetterOrDigit(s.charAt(start))) {
			
			start++;
			
		}
		else if(!Character.isLetterOrDigit(s.charAt(end))) {
			
			end--;
			
		}
		
		else{
			
		if(s.charAt(start)!=s.charAt(end)) {
	    	return false;
	    	
	}
	 start++;
	 end--;
	}}
	return true;
	}
}