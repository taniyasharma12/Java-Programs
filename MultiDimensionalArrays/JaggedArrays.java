package MultiDimensionalArrays;

public class JaggedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
A jagged array is a array in which the number of rows is fixed 
but the number of column is not fixed.
		 */
		
		int nums [][] = new int [3][];
			
			nums[0] = new int[3];
			nums[1] = new int[4];
			nums[2] = new int[2];
			
			for(int i=0; i<nums.length; i++) {
				
			   for(int j=0; j<nums[i].length; j++) {
				
				nums[i][j]  = (int)(Math.random()*10);
				   System.out.print(nums[i][j]);
			}
			   System.out.println();

	}

}

}