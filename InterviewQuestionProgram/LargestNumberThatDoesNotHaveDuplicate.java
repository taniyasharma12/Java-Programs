/**
 * 
 */
package InterviewQuestionProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class LargestNumberThatDoesNotHaveDuplicate {

	
	/*
Given an array of integers, find the largest number that does not have any duplicates in the array.
Example:
Input:
arr = [4, 3, 2, 7, 3, 4, 8]
Output:
8
Explanation:
The unique numbers are [2, 7, 8], and the largest among them is 8.
 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]  ={4, 3, 2, 7, 3, 4, 8};
		
		System.out.println(largestNumberWithoutDuplicate(arr));
		
	}
	
	public static int largestNumberWithoutDuplicate(int nums[]) {
		
		Map<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
		
		for(int i=0 ; i<nums.length; i++) {
			
		map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
		
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(Integer i : map.keySet()) {
			
			if(map.get(i)==1) {
				
				list.add(i);
			}
		}
		
		Collections.sort(list, (a,b)-> (a-b));
	
		return list.get(list.size()-1);

}
}


