package BasicJavaPrograms;

public class VerifyNumberIsPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 454;
		
		int temp = number;
		
		int reverse = 0;
		
		while(temp>0) {
			
			int lastDigit = temp%10;
			
			reverse = reverse*10 + lastDigit;
			
			temp =temp/10; 
			
		}
		
		if(reverse==number) {
			
			System.out.println("is palindrome");
		}
	}

}
