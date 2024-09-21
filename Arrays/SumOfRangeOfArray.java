package Arrays;

public class SumOfRangeOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] nums = {1,2,3,4,5};
		
		/*
		 
		i=1;
		 
		nums 1,2,3,4,5
		pref 1,_,_,_,_ so pref[1] = pref[0] ie; i-1, + nums[i]; 1+2=3
		
		i=2;
		nums 1,2,3,4,5
		pref 1,3,_,_,_ so pref[2] = pref[1] ie; i-1, + nums[i]; 3+3 = 6
		*/
		//creating an empty array to store prefix sum

		int [] pref = new int[nums.length];
		
		for(int i=0; i<nums.length; i++) {
			
			System.out.print(nums[i] + " ");
			
			}
		
		prefix(nums,pref);
		
		System.out.println(sumRange(pref,2,4));
		
	}
	
	public static void prefix(int nums[], int pref[]) {
		
		pref[0] = nums[0];
		
		for(int i=1; i<nums.length; i++) {
			
			pref[i] = pref[i-1] + nums[i];
		}
		
		System.out.println("prefix sum array");
		
		for(int i=0; i<pref.length; i++) {
			
		System.out.print(pref[i] + " ");
		
		}
		
		System.out.println();
		
	}
	
	public static int sumRange(int pref[], int left, int right) {
		
		if(left==0) {
			
			return pref[right];
		}
		else {
			
			return pref[right]-pref[left-1];
		}
	}
}