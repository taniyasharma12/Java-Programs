package Arrays;

public class SubArrayWithLargestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		System.out.print(maxArray(nums));

	}
	
	public static int maxArray(int nums[]) {
		
		
		int bag =0;
		
		int ans =0;
		
		for(int i=0; i<nums.length; i++) {
			
			bag += nums[i];
		    ans = Math.max(ans, bag);
		
		if(bag<0) {
			bag =0;
		}
	}
	
	return ans;
}
}