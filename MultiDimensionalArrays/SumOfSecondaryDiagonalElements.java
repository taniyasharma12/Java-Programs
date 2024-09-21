package MultiDimensionalArrays;

import java.util.Scanner;

public class SumOfSecondaryDiagonalElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(); 
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		
		int sum =0;
		//print rowwise
		for(int i=0; i<r; i++) {
			for(int j =0; j<c; j++) {
				
				arr[i][j] = sc.nextInt();
			}
		
		}
		for(int i=0; i<r; i++) {
			sum = sum +	arr[i][r-i-1];
			}
		
	System.out.println(sum);
}
}