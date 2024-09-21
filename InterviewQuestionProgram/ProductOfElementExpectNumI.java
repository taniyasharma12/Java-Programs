/**
 * 
 */
package InterviewQuestionProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

/*You are given an array of integers called nums. Your task is to create a new array result such that each element at index i of the result is the product of all the elements in nums except nums[i].
Important:
You cannot use division in this problem.
Try to solve the problem in O(n) time complexity.
𝐄𝐱𝐚𝐦𝐩𝐥𝐞:
𝐈𝐧𝐩𝐮𝐭:
nums = [1, 2, 3, 4] 
                    
Output:
result = [24, 12, 8, 6]
𝐄𝐱𝐩𝐥𝐚𝐧𝐚𝐭𝐢𝐨𝐧:
The product of all elements except the one at index 0 is 2 * 3 * 4 = 24.
The product of all elements except the one at index 1 is 1 * 3 * 4 = 12.
The product of all elements except the one at index 2 is 1 * 2 * 4 = 8.
The product of all elements except the one at index 3 is 1 * 2 * 3 = 6.

 */
public class ProductOfElementExpectNumI {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []nums = {1, 2, 3, 4};

		System.out.print(product(nums));
		
		
	}

	public static String product(int [] nums) {
		
		
		int [] prefix = new int[nums.length];
		int [] suffix = new int[nums.length];

		 prefix[0] =nums[0];
		 suffix[nums.length-1]= 1;
		
		 for (int i=1; i<nums.length; i++) {
			 
			 prefix[i] = prefix[i-1] * nums[i-1];
			 
		 }
		 
         for (int i=nums.length-2; i>=0; i--) {
			 
			 suffix[i] = suffix[i+1] * nums[i+1];
			 
		 }
         
         int result [] = new int [nums.length];
         for(int i=0; i<nums.length; i++) {
		 
        	 result[i]=prefix[i]*suffix[i];
	}
	
	return Arrays.toString(result);
	
}
}

