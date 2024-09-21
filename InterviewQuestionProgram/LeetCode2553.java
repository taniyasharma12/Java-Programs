package InterviewQuestionProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeetCode2553 {

	
	public static void main(String args[]) {
		
		
	int arr[] =	{13,25,83,77};
	
	System.out.println(separateDigits(arr));
	
	}
	
	
	public static String separateDigits(int[] nums) {
        
		ArrayList<Integer> anslist = new ArrayList<Integer>();
		
		for(int i=0; i<nums.length; i++) {
			
			anslist.addAll(separator(nums[i]));
			
		}
		
		int arr [] = new int[anslist.size()];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = anslist.get(i);
		}
		
		return Arrays.toString(arr);
		
	}
	
	public static ArrayList<Integer> separator(int num) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int temp=num;
		while(temp>0) {
			
			list.add(temp%10);
			temp=temp/10;
		}
		
		Collections.reverse(list);
		return list;
		
	}
}

/**
 * @author TaniyaSharma
 *
 */