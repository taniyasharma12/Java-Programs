package Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] nums = {0,1,0,3,2,3};
		System.out.println(lengthOfLIS(nums));
		
	}

public static int lengthOfLIS(int[] nums) {
        
        int count =0;

        int j=1;
 
        for(int i=1; i<nums.length; i++){
              if(nums[i]>nums[i+j]){
                count++;
                j++;
              }
        }
        
        return count;
    }
}
	
	
	
	
	

