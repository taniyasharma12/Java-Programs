package BasicJavaPrograms;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String str = "madam";
		
		System.out.println(isPalindrome(str));
	}
	
	public static boolean isPalindrome(String str) {
		int start =0;
		
		int end = str.length()-1;
		
		while(end>=0) {
			
			if(str.charAt(start)!=str.charAt(end)) {
				
				return false;
			}
			start ++;
			end--;
		}
		return true;
		
	}
		
		
		
		
		
		
		
		
		
		
		
	}	
/*		String str = "racecar";
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			
			rev = rev +str.charAt(i);
		}
			
		System.out.println(rev);
		if(rev.equalsIgnoreCase(str))
		{
			System.out.println("this is palindrome");
		}
	}
*/

