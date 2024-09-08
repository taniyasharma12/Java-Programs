package SlidingWindowFixedSize;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MaximumSumOfDistinctSubArraysWithSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums [] = {1,5,4,2,9,9,9};
		int k = 3;
		
		System.out.println(maximumSubarraySum(nums,k));
	}

	
		
/*
 1.take 2 pointers i and j, variable sum to store sum of elements, maxSum to store max sum
 2.create a hashmap to store element an their frequencies
 3.while j < array length 
 4.put frequency in hashmap and take sum of elements
 5.if window size is less than k j++
 6.if window size == k && window size == map.size , take max value of sum and assign to maxSum
 7.decrease i th element from map , if ith element frequency is 0 then remove element from map
 8.return maxSum
 
 
  
 */
	public static long maximumSubarraySum(int nums[], int k) {

		int i=0;
		int j=0;
		int sum=0;
		int maxSum=0;
		
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		while(j<nums.length) {
			
			map.put(nums[j], map.getOrDefault(nums[j], 0)+1);
			
			sum+=nums[j];
			
			if(j-i+1<k) {
				j++;
			}
			else if(j-i+1==k) {
				if(map.size()==j-i+1) {
					
					maxSum = Math.max(maxSum, sum);
					
					sum-=nums[i];
					
					map.put(nums[i], map.get(nums[i])-1);
					if(map.get(nums[i])==0) {
						map.remove(nums[i]);
					}
				}
				i++;
				j++;
			}
		}
		return maxSum;
	
	}
}
