package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class SortArrayByIncreasingFrequencyLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 Step 1 - Make frequency hashmap
 Step 2 - Create array with Integer (non primitive data Type) and add all array values to it
 Step 3 - create a comparator to sort  
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
		
		int nums [] = {1,1,2,2,2,3};
		
		System.out.println(Arrays.toString(frequencySort(nums)));
	}
//https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
	
	
	// Set<String> set = map.keySet();
	
	//ArrayList<String> list = new ArrayList<String>(map.keySet);
	public static int[] frequencySort(int[] nums) {
	
		
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length; i++) {
			
		if(map.containsKey(nums[i])) {
			map.put(nums[i], map.get(nums[i])+1);
		}
		else {
			
			map.put(nums[i], 1);
		}
		}
		
		Integer[] arr = new Integer[nums.length];
		
		for (int i=0; i < nums.length; i++) {
            arr[i] = nums[i];

        }

		//list to store all keys
		//a-b ascending
		//b-2 descending
		Arrays.sort(arr, (a, b) -> {
            if (map.get(a) != map.get(b)) {
                // if freq of numbers are not equal then return in increasing order based on
                // freq.
                return map.get(a) - map.get(b);
            } else {
                // otherwise sort them in decreasing order based on number in nums.
                return b - a;
            }
        });
		for (int i=0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
		
}
}