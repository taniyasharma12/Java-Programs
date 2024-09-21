package Arrays;

import java.util.Scanner;

public class FindValidTriangeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//A triangle is valid if sum of its two sides is greater than the third side. If three sides are a, b and c, then three conditions should be met. 

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a+b>c&&a+c>b&&b+c>a) {
			System.out.println("valid triangle");
		}
		else {
			System.out.println("not valid triangle");
		
		}
	}
	

}
