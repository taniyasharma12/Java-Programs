package LearnYard.MultiDimensionalArrays;

import java.util.Scanner;

public class MultiplicationOfTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//number of columns of first matrix should be equal to number fo rows of second matrix
		//answer = r1 * c2
		
		Scanner sc = new Scanner(System.in);
		
		int r1= sc.nextInt();
		int c2 = sc.nextInt();
		int c1r2 = sc.nextInt();
		
		int m1[][] = new int[r1][c1r2];
		
		int m2[][] = new int[c1r2][c2];
		
		for(int i=0; i<r1; i++) {
			
			for(int j=0; j<c1r2; j++) {
				
				m1[i][j]= sc.nextInt();
			}
		}
		
for(int i=0; i<c2; i++) {
			
			for(int j=0; j<c1r2; j++) {
				
				m2[i][j]= sc.nextInt();
			}
		}

//print multiplicattion

int ans [][] = new int[r1][c2];

for(int i=0; i<r1; i++) {
	
	for(int j=0; j<c2; j++) {
		
		int sum = 0;
		
		for(int k=0; k<c1r2; k++) {
			sum = sum + m1[i][k]* m2[j][k];
			ans[i][j]= sum;
		}
	}
		}

for(int i=0; i<ans.length; i++) {
	for(int j=0; j<ans[0].length; j++) {
		System.out.println(ans[i][j]);
	}
}
	}
}
