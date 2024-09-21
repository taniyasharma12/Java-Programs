package Arrays;

import java.util.*;

public class TwoSumLeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://leetcode.com/problems/word-pattern/description/?envType=study-plan-v2&envId=top-interview-150
		
		int nums [] = {2,7,11,15};
		
		int target = 9;
		
		System.out.println(Arrays.toString(twoSum(nums, target)));
		
	}

	
	
	 public static int[] twoSum(int[] nums, int target) {
	        
		 
		 Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		        
		 for(int i=0; i<nums.length; i++) {
			 
			 //get complement using target value;
			 int complement = target - nums[i];
			 //search the hashmap for complement if present we got our pair
		 if(map.containsKey(complement)){

			 return new int [] {map.get(complement), i};
		 }
			 
			 //put the element in hashmap for subsequent searched
		 
		 map.put(nums[i], i);
		 
		 
	    }
		return null;
	}

}
