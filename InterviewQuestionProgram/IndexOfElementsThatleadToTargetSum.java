package InterviewQuestionProgram;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class IndexOfElementsThatleadToTargetSum {

	
/*
 1. Given a list of integers and a target sum, write a function to find the indices of the two numbers in the list that add up to the target sum. You may assume that each input would have exactly one solution, and you may not use the same element twice.
Example: 
int[] nums = {3, 2, 4}
target=6;
Output: [1, 2]

 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {3, 2, 4};
		
		int target = 6;
		
		System.out.println(result(nums,target));
		
		System.out.println(result1(nums,target));

	}

	
	
	
	public static String result(int nums[], int target){
		
		int index1=0, index2 =0;
		for(int i=0; i<nums.length; i++) {
			
			for(int j=i+1; j<nums.length; j++) {
				
				if(nums[i]+nums[j]==target) {
					
					index1=i;
					index2=j;
					
				}
			}
		}
		
		return Arrays.toString(new int[] {index1,index2});
	}
	
	public static String result1(int nums[], int target) {
		
		int complement;
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		for(int i=0; i<nums.length; i++) {
			
			complement = target-nums[i];
			
		if(map.containsKey(complement)) {
			
			return Arrays.toString(new int [] {map.get(complement),i});
		}
		else {
			
			map.put(nums[i], i);
		}
		}
		return null;
	}
}


