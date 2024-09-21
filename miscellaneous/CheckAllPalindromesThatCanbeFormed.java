package miscellaneous;

public class CheckAllPalindromesThatCanbeFormed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str = "aabbccsddssss";
		
		for(int i=0; i<str.length(); i++) {
			
			for(int j=i+1; j<str.length(); j++) {
				
				if(isPalindrome(str.substring(i, j))) {
					
					System.out.println(str.substring(i, j));
				}
			}
		}
	}

	
	/*
	 1.create a function which determines is a string is palindrome or not 
	 2.take two loops and 2 pointers i and j 
	 3.now check each pair, substring whether string is palindrome or not 
	 */
	
	public static boolean isPalindrome(String str) {
		
		
		int start =0;
		
		int end = str.length()-1;
		
		while(end>=0) {
			
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}
}
