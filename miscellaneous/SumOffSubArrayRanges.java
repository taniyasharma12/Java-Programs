package miscellaneous;

public class SumOffSubArrayRanges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums [] = {1,2,3};
		
		/*
		1
		2
		3
		12
		13
		23
		=> 0+0+0+1+2+1
		 */
		
		System.out.println(subArrayRanges(nums));
		
	}

	//https://leetcode.com/problems/sum-of-subarray-ranges/submissions/1372223476/
	
	public static int subArrayRanges(int[] nums) {
	    
		int sum=0;
		
		for(int i=0; i<nums.length; i++) {
			
			int largest = nums[i];
			int smallest = nums[i];
			
			for(int j=i; j<nums.length; j++) {
				
				largest = Math.max(largest,nums[j]);
				smallest = Math.min(smallest, nums[j]);
				sum += largest-smallest;	

			}
			
		}	
		return sum;
	}
}

