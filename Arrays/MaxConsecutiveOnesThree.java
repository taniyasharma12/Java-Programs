package Arrays;


public class MaxConsecutiveOnesThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = {1,1,1,0,0,0,1,1,1,1,0};
		int k = 2;
		System.out.println(longestOnes(nums,k));
	}

	
	public static int longestOnes(int[] nums, int k) {
		
		int start=0;
        int ans=0;
        int zero_count=0;
        for(int curr=0; curr<nums.length; curr++){

            if(nums[curr]==0){
                zero_count++;

            }
            while(zero_count>k){
                if(nums[start]==0){
                zero_count--;
            }
            start++;
        }
     ans= Math.max(ans, curr-start+1);
    }

    return ans;
}
}