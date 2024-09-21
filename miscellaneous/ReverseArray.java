package miscellaneous;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {23,4,34,56,78,90};
		
		
			
			System.out.println(reverse(nums));
		}
		
	

	
	
	public static String reverse(int nums[]) {
		
		int left = 0;
				
		int right = nums.length-1;
		
		while(left<right) {
			
			int temp = nums[left];
			nums[left]=nums[right];
			nums[right]=temp;
			
			left++;
			right--;
		}
		
		return Arrays.toString(nums);
		
		
	}
}
