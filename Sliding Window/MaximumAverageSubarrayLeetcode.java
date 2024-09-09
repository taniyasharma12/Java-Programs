package SlidingWindowFixedSize;

public class MaximumAverageSubarrayLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nums [] = {1,12,-5,-6,50,3};
		int k = 4;
		
		System.out.println(findMaxAverage(nums,k));
	}
	//https://leetcode.com/problems/maximum-average-subarray-i/?envType=study-plan-v2&envId=top-interview-150
	
	public static int findMaxAverage(int nums[], int k) {
		
		int i=0;
		int j=0;
		int sum =0;
		int maxSum = Integer.MIN_VALUE;
		
     
		while(j<nums.length) {
			
			sum+=nums[j];
			
			if(j-i+1<k) {
				
				j++;
			}
			
			else if(j-i+1==k) {
				
				maxSum = Math.max(maxSum, sum);
				
				sum-=nums[i];
				
				i++;
				j++;
			}
		}
		
		
		
		
		return maxSum/k;
		
		
	}
	
	
}
