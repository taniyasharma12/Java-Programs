package BasicJavaPrograms;

import java.util.Scanner;

public class SumOfAllOddNumber1toN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			
			if(i%2!=0) {
				
				sum = sum + i;
			}
		}

		System.out.println("sum is " + sum);
	}

}
