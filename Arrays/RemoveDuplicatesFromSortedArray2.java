package Arrays;

public class RemoveDuplicatesFromSortedArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/?envType=study-plan-v2&envId=top-interview-150

		int nums[] = { 1, 1, 1, 2, 2, 3 };
		
		// 1 !=

		 int j = 1;
	        for (int i = 1; i < nums.length; i++) {
	            if (j == 1 || nums[i] != nums[j - 2]) {
	                nums[j] = nums[i];
	                j++;
	            }
	        }
	        
for(int k=0; k<j; k++) {
	        	
	        	System.out.print(nums[k] + " ");
	        	
	        }
	}
}
