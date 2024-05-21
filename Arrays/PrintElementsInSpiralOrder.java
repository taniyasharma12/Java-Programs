package LearnYard.MultiDimensionalArrays;

import java.util.Scanner;

public class PrintElementsInSpiralOrder {

		public static void main(String[] args) {
	        
			Scanner sc = new Scanner(System.in);
			int r = sc.nextInt();
			int c = sc.nextInt();
			int arr[][]= new int[r][c];
			for(int i=0; i<r; i++) {
				for(int j=0; j<c; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
            int topRow = 0;
			int bottomRow = r-1;
			int leftColumn = 0;
			int rightColumn = c-1;
			while(topRow<=bottomRow && leftColumn<=rightColumn) {

				//print top row left to right
				for(int i=leftColumn; i<rightColumn; i++) {
					System.out.print(arr[topRow][i]+ " ");
			}
				if (topRow == bottomRow) {
	                System.out.print(arr[topRow][rightColumn] + " ");
	                break;
	            }
				//print right column top to bottom
				for(int j= topRow; j< bottomRow; j++)
                                                       {
					System.out.print(arr[j][rightColumn]+ " ");
			}

				if (leftColumn == rightColumn) {
	                System.out.print(arr[bottomRow][rightColumn] + " ");
	                break;
	            }
				//right to left bottom row
				for(int i= rightColumn; i>leftColumn; i--) {
					System.out.print(arr[bottomRow][i]+" ");
				}
				//bottom to top , bottom row to top row	
			for(int j= bottomRow; j>topRow; j--)
			{
				System.out.print(arr[j][leftColumn]+ " ");
			}
			topRow++;
			bottomRow--;
			leftColumn++;
			rightColumn--;
		}
		}
}