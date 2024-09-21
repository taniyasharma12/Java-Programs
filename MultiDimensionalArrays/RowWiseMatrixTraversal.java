package MultiDimensionalArrays;

import java.util.Scanner;

public class RowWiseMatrixTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(); 
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		//print rowwise
		for(int i=0; i<r; i++) {
			for(int j =0; j<c; j++) {
				
				arr[i][j] = sc.nextInt();
			}
		
		}
		
		//print column wise
		for(int j =0; j<c; j++) {
			for(int i=0; i<r; i++) {
				
				System.out.print(arr[i][j]+" ");
				System.out.println();
			}
		}
			
		}
	}

