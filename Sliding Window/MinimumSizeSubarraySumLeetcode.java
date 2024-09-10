package SlidingWindowVariableSize;

public class MinimumSizeSubarraySumLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums [] = {1,1,4,4};
		
		int target = 5;
		
		System.out.println(minSubArrayLen(target,nums));
		
		
		
//https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150
	}
	
	/*
	 1. Take two pointers i and j, take variable sum to store sum of elements, 
	    take minLength to store minimum length
	 2. while j< array length add sum and do j++
	 4. if cum==target , assign minLength
	 5. if sum>target remove ith element and do i++, if sum==target calculate minLength
	 5. increment j++
	 6. return minLength 	 
	 */
	 public static int minSubArrayLen(int target, int[] nums) {
		
		 int i=0;
		 int j=0;
		 int minLength = Integer.MAX_VALUE;
		 int sum=0;
		 
		while(j<nums.length) {
			
			sum+=nums[j];
			
			if(sum<target) {
				
				j++;
			}
			else if(sum==target) {
				
				minLength = Math.min(minLength, j-i+1);
				
				j++;
			}
			else {
				
				while(sum>target) {
					
					sum-=nums[i];
					i++;
				
				if(sum==target) {
					
					minLength = Math.min(minLength, j-i+1);	
				}
			}
			j++;
		}
		}	 
		 return minLength;

	 }
}
