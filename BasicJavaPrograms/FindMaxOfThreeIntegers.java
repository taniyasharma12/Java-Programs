package BasicJavaPrograms;

import java.util.Scanner;

public class FindMaxOfThreeIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//three integers a,b and c 
		//compare with a with b and c , if greater than both then max
		//else if compare b with both
		//else c is max
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int max = 0;
		
		if(a>=b && a>=c) {
			
			max = a;
		}
		else if(b>=a && b>=c) {
			max = b;
		}
		else {
			max=c;
		}
		
		System.out.println(a+ " " + b + " " + c +" "+ "max is "+ max);
	}
	

}
