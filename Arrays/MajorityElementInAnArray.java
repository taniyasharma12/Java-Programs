package Arrays;

import java.util.Arrays;

public class MajorityElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// https://leetcode.com/problems/majority-element/?envType=study-plan-v2&envId=top-interview-150
		
		//Moor's Voting algorithm

		int nums[] = { 2,2,1,1,1,2,2 };
		
		System.out.println(majorityElement(nums));
		
	}

	public static int majorityElement(int[] nums) {
        
		/*Arrays.sort(nums);
		
		
		return nums[nums.length/2];
		
		*/
		
int majority = nums[0];
		
		int count =0;
		
		for(int i=0; i<nums.length; i++) {
			
			if(count==0) {
				majority = nums[i];
				count++;
			}
			
			else if(nums[i]==majority) {
				count++;
			}
			else {
				count--;
			}
		}
		int count1=0;
		for(int i=0; i<nums.length; i++) {
			if(majority ==nums[i]) {
				count1++;
			}
		}
		if(count1>nums.length/2) {
			
			return majority;
		}
	
			return -1;
	
	}

}
