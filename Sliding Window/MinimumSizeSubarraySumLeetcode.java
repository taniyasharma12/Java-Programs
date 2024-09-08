package SlidingWindowFixedSize;

public class MinimumSizeSubarraySumLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums [] = {1,4,4};
		
		int target = 1;
		
		System.out.println(minSubArrayLen(target,nums));
		
//https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150
	}
	
	 public static int minSubArrayLen(int target, int[] nums) {
		
/*
 1. Take two pointers i and j, take variable currSum to store sum of elements, take minWindowSize to store minimum length
 2. while j< array length add sum and do j++
 4. if sum >= target , take minimum length from j-i+1 and minLen
 5. decrease sum of ith element from sum and increment i++
 6. return minLength 	 
 */
		 int i=0;
		 int j=0;
		 int currSum=0;
		 int minWindowSize=Integer.MAX_VALUE;
	
		 while(j<nums.length) {
			 
			 currSum+=nums[j];
			 
				 j++;
			 
			while(currSum>=target) {
				 
				 minWindowSize = Math.min(j-i, minWindowSize);
				 
				 currSum-=nums[i];
				 i++;
			 }
		 }
		 if(minWindowSize==Integer.MAX_VALUE){
			    return 0;
		 }
			else
			{
			return minWindowSize;
			    }
			}

}
