package BasicJavaPrograms;
import java.util.Scanner;

public class AllPossiblePalindromes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
	    solution(str);
		
		//madam
		
	}
	
	
	public static void solution(String str) {
		
		for(int i=0; i<str.length();i++) {
			for(int j=i+1; j<=str.length(); j++) {
				if(isPalindrome(str.substring(i,j))){
				System.out.println(str.substring(i,j));
			}
		}
	}
	}
	
	
	public static boolean isPalindrome(String str) {
		
		int start =0;
		
		int end = str.length()-1;
		
		while(end>0) {
			
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start ++;
			end--;			
		}
		return true;
	}
	
}