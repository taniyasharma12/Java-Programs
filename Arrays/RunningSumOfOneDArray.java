package Arrays;

public class RunningSumOfOneDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {10,4,8,3};
		
		int ans[] = new int[nums.length] ;
		
		runningSum(nums, ans);
		
		for(int i=0; i<ans.length; i++) {
			
			System.out.print(ans[i] + ", ");
		}
		
	}
	
	public static int[] runningSum(int nums[], int sum[]) {
		
		
		 sum[0] = nums[0];
		 
		 for(int i=1; i<nums.length; i++) {
			 
			 sum[i] = sum[i-1]+nums[i];
		 }
		return sum;
		
	}
}

	/*
	
	public static int[] runningSum(int nums[], int ans[]) {
		
		int n =nums.length;
		
		for(int i=0; i<n; i++) {
			
			int sum_till_i =0;
			
			for(int j=0; j<=i; j++) {
				
				sum_till_i = sum_till_i +nums[j];
				
			}
			ans[i] = sum_till_i;
		}
		
		
		
		
		return ans;
		
		
		
	}
}

	*/