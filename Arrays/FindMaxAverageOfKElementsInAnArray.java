package Arrays;

public class FindMaxAverageOfKElementsInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int nums [] = {4,5,6,1,2,3};
		
		int k =4;
		
		System.out.println(maxAverage(nums, k));
		
	}

	
	public static int maxAverage(int nums[], int k) {
		
		int startIndex =0;
		
		int endIndex = k;
		
		int sum=0;
		
		//get sum of starting window
		
		for(int i=0; i<k; i++) {
			
			sum = sum + nums[i];
			
		}
		
		int maxSum=sum;
		
		//start sliding window
		
		while(endIndex<nums.length) {
			
			sum-= nums[startIndex]; //remove previous element
			startIndex++;
			
			sum += nums[endIndex]; // Add next element
		      endIndex++;

		      maxSum = Math.max(maxSum, sum); // Update max sum
		    }

		    // Return the average
		
		    return maxSum;
		}
		
		
	}

