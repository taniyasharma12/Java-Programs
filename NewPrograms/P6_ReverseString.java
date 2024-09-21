package NewPrograms;

import java.util.Scanner;

public class P6_ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev + str.charAt(i);
		}
		
		System.out.print(rev);
	}
}

