package Arrays;

public class RemoveDuplicateElementsWithoutSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {1,2,2,3,4,5,5,6,6};
		
		removeDuplicates(arr);
		
		
	}
		public static void removeDuplicates(int[] nums) {
	        int j = 1;
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[i - 1]) {
	                nums[j] = nums[i];
	                j++;
	            }
	        }
	        
	        for(int k=0; k<j; k++) {
	        	
	        	System.out.print(nums[k] + " ");
	        	
	        }

	    }
	}