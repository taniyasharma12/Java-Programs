package miscellaneous;

public class CheckIfStringIsAPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindrome("taniya"));
	}

	
	public static boolean isPalindrome(String str) {
		
	//compare last and first element if not equal not palindrome
		
	int left =0;
	int right = str.length()-1;
	
	while(right>0) {
		
		if(str.charAt(left)!=str.charAt(right)) {
			
			return false;
		}
		left++;
		right--;
	}
		return true;
	}
	
}
