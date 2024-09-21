package InterviewQuestionProgram;

import java.util.Arrays;

public class returnIndicesThatAddToTarget {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] nums = {3, 2, 4};
		
		int target = 6 ;
		
		System.out.println(answer(nums,target));
		
		
		//Output: [1, 2] 
		
	}

	
	public static String answer(int[] nums, int target)
	
	{
		
		int result [] = new int[2];
		
		for(int i=1; i<nums.length; i++) {
			
			if(nums[i-1]+nums[i]==target) {
				
				result[0]=i-1;
				result[1]=i;
				
			}
		}
		
		return Arrays.toString(result);
	}
	
}


