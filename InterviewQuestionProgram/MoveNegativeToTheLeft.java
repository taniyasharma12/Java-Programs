/**
 * 
 */
package InterviewQuestionProgram;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveNegativeToTheLeft {

	
/*
Given an array of integers, write a function to move all the negative numbers to the left end of the array without changing the relative order of the non-negative numbers. The function should do this in place with a minimum number of operations.
Example:
int[] nums = {1, -1, 3, -2, -3, 5, 6, -7}
Output: [-1, -2, -3, -7, 1, 3, 5, 6]
 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {1, -1, 3, -2, -3, 5, 6, -7};
		
	    System.out.println(negativeToLeft(nums));
	    
	}

	
	public static String negativeToLeft(int nums[]) {
		
		  ArrayList<Integer> listNeg= new ArrayList<Integer>();
		  ArrayList<Integer> listPos= new ArrayList<Integer>();
		  
		  for(int i=0; i<nums.length; i++) {
			  
			  if(nums[i]<0) {
				 
			  listNeg.add(nums[i]);
			  
			  }
			  else {
				  
				  listPos.add(nums[i]);
				  
				  }
		}
		  
		listNeg.addAll(listPos);
		for(int i=0; i<nums.length; i++) {
		
			nums[i]=listNeg.get(i);
		}
		
	return Arrays.toString(nums);
}
}

