package Strings;

import java.util.Scanner;

public class StringIntroduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str ;
		
		String str2 = "This is string 2";
		
		String str3 = new String("This is string 3");
		
		Scanner sc = new Scanner(System.in);
		
		str = sc.next();  //until white space
		
		sc.nextLine();

		System.out.println(str);
		
		
		str2 = sc.nextLine();  // until /n character
		
		System.out.println(str2);

		str3 = sc.nextLine();

		System.out.println(str3);

	}

}
