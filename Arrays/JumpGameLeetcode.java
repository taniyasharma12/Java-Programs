package Arrays;

public class JumpGameLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nums [] = {2,3,1,1,4};
		
		System.out.println(canJump(nums));
		
		
	}

public static boolean canJump(int[] nums) {
       
	//initially final position will be last index
	int finalPosition = nums.length-1;
        
      //Start with the second last index
	
	for( int index = nums.length-2; index>=0; index--) {
		
		//if you can reach final position from index
		//update the final position flag
		
		if(index + nums[index]>=finalPosition) {
			finalPosition = index ;
	
		}
        
    }
	//if we reach first index then we can
	//make jump possible
	return finalPosition==0;
}
}
