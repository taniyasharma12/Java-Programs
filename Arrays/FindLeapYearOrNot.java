package Arrays;

import java.util.Scanner;

public class FindLeapYearOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //year that is fully divided by 4 is leap year
		Scanner sc = new Scanner(System.in);
		
		int year = sc.nextInt();
		
		boolean isLeap = true;
		
		if(year%4==0) {
			
			System.out.println(isLeap);
		}
		else {
			
			isLeap = false;
			System.out.println(isLeap);
	
		}
	}

}
