package SlidingWindowFixedSize;

public class NumberOfSubArraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/
		
		int [] arr = {11,13,17,23,29,31,7,5,2,3};
		int k = 3;
		int threshold = 5;
	
		System.out.println(numOfSubarrays(arr,k,threshold));
		
	}

	public static int numOfSubarrays(int nums[], int k, int threshold) {
		
/*
 1. Take 2 pointers i and j, take sum variable 
 2. iterate while j < length of array and add sum
 3. if window size is < k then j++;
 4. if window size==k && sum avg >=threshold then count++  		
 5. decrease i from sum and i++, j++ 				
 */
		int i=0;
		int j=0;
		int sum=0;
		int count=0;
		
		while(j<nums.length) {
			
			sum+=nums[j];
			
			if(j-i+1<k) {
				j++;
			}
			else if(j-i+1==k) {
				
				if(sum/k>=threshold) {
				count++;
				}
				sum-=nums[i];	
				i++;
				j++;
			}
		
		}
		return count;

	}
	}
