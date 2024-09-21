package miscellaneous;

public class CheckLongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nums [] = {10,9,2,5,3,7,101,18};
		
		int count =0;
				
		
		for(int i=1; i<nums.length; i++) {
			
			if(nums[i]> nums[i-1]) {
				
		count++;
			}
			
		}
		
		System.out.println(count);
	}

	
	
}
