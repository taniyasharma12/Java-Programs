package Arrays;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://leetcode.com/problems/product-of-array-except-self/description/
		
		int [] nums = {1,2,3,4};
		
		//output [24,12,8,6]
		
		System.out.println(productExceptSelf(nums));
		
		
		
	}
	
      public static  String productExceptSelf(int[] nums) {
	       
    	  int [] prefix = new int[nums.length];
    	  
    	  int [] suffix = new int[nums.length];
    	  
    	  prefix [0] = 1;  // 1 because there is not element before first element
    	  
    	  suffix[nums.length-1] =1; // 1 because there is not element after last element
    	  
    	  for(int i=1; i<nums.length; i++) {
    		  
     //[i-1] contains nums[i-1] but prefix[i-1] contians product of its prefixes
    //0- (i-2) * (i-1)
    		  prefix[i] = prefix[i-1]*nums[i-1];
    	  }
	  
    	  for(int i = nums.length-2; i>-1; i--) {
    		  
    		  suffix[i] = suffix[i+1]* nums[i+1];
    	  }
    	  int ans [] = new int[nums.length];
    	  for(int i=0; i<nums.length; i++) {
    		  ans[i] = prefix[i]*suffix[i];
    	  }
    	  
    	  return Arrays.toString(ans);
      
    }
}

