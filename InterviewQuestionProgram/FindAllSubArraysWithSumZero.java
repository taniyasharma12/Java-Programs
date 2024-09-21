package InterviewQuestionProgram;

public class FindAllSubArraysWithSumZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = {4, -3, 2, 1, 6, -4, -2, 3, 5};
	}

	
	
	
	public static int [] allSubArraysWithSumZero(int [] nums) {
		
		
		int i=0;
		int j=0;
		int sum =0;
		
		while(j>nums.length) {
			
			sum+=nums[j];
			
			if(sum!=0) {
				
				j++;
			}
			else if(sum==0) {
				
				
			}
		}
		
		
		
		
		return nums;

	}
}


