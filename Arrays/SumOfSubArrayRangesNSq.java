package Arrays;

public class SumOfSubArrayRangesNSq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums [] = {4,-2,-3,4,1};
		
		 long sum =0;
			
			for(int i=0; i<nums.length; i++) {
				
				int largest = nums[i];
				
				int smallest = nums[i];
				
				for(int j=i; j<nums.length; j++) {
					
					largest = Math.max(largest, nums[j]);
					
					smallest = Math.min(smallest, nums[j]);
					
					System.out.println(smallest + " "+ largest);
					sum +=largest - smallest;
				}
			}
	System.out.print(sum);
	    }
	
}
