package Arrays;

public class RemoveElementKFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//https://leetcode.com/problems/remove-element/?envType=study-plan-v2&envId=top-interview-150
		
		int nums[] = {0,1,2,2,3,0,4,2};
		
		int k = 2;
		
		System.out.println(removeElement(nums, k));
		
	}
	public static int removeElement(int[] nums, int val) {
		 
		int j=0;
		 for(int i=0; i<nums.length; i++){
		    
		    if(nums[i]!=val){

		       nums[j] = nums[i];
		       j++;
		    
		    }
		 }
		 return j;

		    }
		}

