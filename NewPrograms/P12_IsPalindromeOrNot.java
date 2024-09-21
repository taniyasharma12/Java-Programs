package NewPrograms;

public class P12_IsPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "racecar";
		System.out.println(isPalindrome(str));

	}

	public static boolean isPalindrome(String str) {
		
		int i=0; 
		int j= str.length()-1;
		
		while(i<j) {
			
			if(str.charAt(i)!=str.charAt(j)) {
			return false;
			}
			i++;
		    j--;
		}
		
	return true;
}}
