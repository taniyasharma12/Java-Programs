/**
 * 
 */
package InterviewQuestionProgram;

import java.util.Arrays;

/*
Given an array of non-negative integers representing digits of a large number, write a function that adds one to the number and handles any carryover. The digits are stored such that the most significant digit is at the head of the list. Your function should return the updated array of digits.
𝐄𝐱𝐚𝐦𝐩𝐥𝐞:
Input: arr = [1, 5, 6]
Output: [1, 5, 7]
Explanation: Adding 1 to the number 156 results in 157.

Input: arr = [1, 2, 9]
Output: [1, 3, 0]
Explanation: Adding 1 to the number 129 results in 130, carrying over from the last digit.
 */
public class AddArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {97,9,90};
		
		// 500 + 60 +7
		System.out.println(addition(nums));
	}
	
	public static String addition(int nums[]) {
		
		
		int number=0;
		int power=0;
		
		for(int i=nums.length-1; i>=0; i--) 
		{
			
			number += nums[i] * Math.pow(10, power);
			power++;
			
		}
		number++;
		
		int temp =number;
		
		int count=0;
		
		while(temp>0) {
			
			temp =temp/10;
			count++;
		}
		
		int[] result = new int[count];
		
		int index =count-1;
		
        while(number>0) {
        	
        	result[index] = number%10;
        	number=number/10;
        	index--;
			
		}
		return Arrays.toString(result);
		
	}

	/*
	public static String addition(int nums[]) {
		
		String sum ="";
		
		for(int i=0; i<nums.length; i++) {
			
			sum+=nums[i];
			
		}
	System.out.println(sum);
	
	int sumInt= Integer.valueOf(sum)+1;
	sum = String.valueOf(sumInt);
	System.out.println(sumInt);

	String[] arr = sum.split("");
	
	return Arrays.toString(arr);
	
}
*/
}


