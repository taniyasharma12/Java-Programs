package BasicJavaPrograms;

import java.util.Scanner;

public class EquationsQuestions {

	public static void main(String[] args) {
		
		//https://codeforces.com/problemset/problem/1807/A


		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int c = sc.nextInt();
		
		if(a+b==c && a-b!=c) {
			
			System.out.println("+");
			
			
		}
		
		if(a-b==c && a+b!=c) {
			
			System.out.println("-");
					
		}
	}

}
