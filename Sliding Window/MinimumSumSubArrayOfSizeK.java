package SlidingWindowFixedSize;

public class MinimumSumSubArrayOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] ={100, 200, 300, 400};
		System.out.println(minimumSum(nums,3));
	}

	
	public static int minimumSum(int nums[] , int k) {
	
/*
1. Take two pointers i and j, take varible sum and minSum = Integer.MAX_VALUE
2. while j< nums length , take sum of elements of nums
3. if window size < k then j++
3. if window size == k, take minimumSum from sum and minSum
4. remove ith element from sum , do i++ and j++ (to get next window[subarray])
 
 */
		int i=0; 
		int j=0;
		int sum=0;
		int minSum = Integer.MAX_VALUE;
		
		while(j<nums.length) {
			
			sum +=nums[j];
	
		if(j-i+1<k) {
			
			j++;
			
		}
		else if(j-i+1==k) {
			
			minSum = Math.min(sum, minSum);
			
			sum -= nums[i];
			
			i++;
			
			j++;
		}
		
		
		}		return minSum;
		
		
	}
	
	}
