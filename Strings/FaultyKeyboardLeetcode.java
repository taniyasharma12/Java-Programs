package Strings;

import java.util.Arrays;

public class FaultyKeyboardLeetcode {
//https://leetcode.com/problems/faulty-keyboard/description/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "poiinter";
		
		System.out.println(finalString(s));
	}

	
public static String swap(String str) {
		
		String ans = "";
		char [] nums = str.toCharArray();
		int left =0;
		int right = str.length()-1;
		while(left<right) {
		char temp = nums[left];
	    nums[left]=nums[right];
		nums[right]=temp;
		left++;
		right--;
		}
		for(int i=0; i<nums.length; i++)
			
		{
			ans += nums[i];
		}
		return ans;
	}
	
	
	public static String finalString(String s) {
	
	//check if character is i if yes reverse
	
		char str [] = s.toCharArray();
		String result ="";
		for(int j=0; j<str.length; j++) {
			
		
		if(str[j]=='i') {
			
			result = swap(result);
					
		}
	
		else {
			result = result+ str[j];
		}
		
	}
	return result;
        
    }
}