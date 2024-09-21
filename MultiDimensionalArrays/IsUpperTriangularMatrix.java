package MultiDimensionalArrays;

import java.util.Scanner;

public class IsUpperTriangularMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean ans = true;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int arr[][] = new int[n][n];
		int sum =0;
		//print rowwise
		for(int i=0; i<n; i++) {
			for(int j =0; j<n; j++) {
				
				arr[i][j] = sc.nextInt();
			}
		
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i>j && arr[i][j]!=0) {
					ans = false;
					break;
				}
				
			}
			}
		
	System.out.println(ans);
}
}