package MultiDimensionalArrays;

public class TwoDArrayIntro {

	

		public static void main(String[] args) {

	        int[][] arr = {
	                {1, 4, 6, 2},
	                {1, 0},
	                {3, 6, 5, 4, 0, 8}
	        };

	        System.out.println(arr.length);
	        System.out.println(arr[0].length);
	        System.out.println(arr[1].length);
	        System.out.println(arr[2].length);

	        for (int i=0; i<arr.length; i++) {

	            for (int j=0; j<arr[i].length; j++) {

	                System.out.print(arr[i][j] + " ");

	            }

	            System.out.println(" ");

	        }

	    }
	}
