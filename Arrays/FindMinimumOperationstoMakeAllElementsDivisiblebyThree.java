package Arrays;

public class FindMinimumOperationstoMakeAllElementsDivisiblebyThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {7,2,3,4};
		
System.out.println(minimumOperations(arr));
	}

	public static int minimumOperations(int[] nums) {

	      int count =0; 
	      for(int i=0; i<nums.length; i++){

	         if(nums[i]%3!=0){
	          
	          if((nums[i]+1)%3==0 || (nums[i]-1)%3==0){

	            count++;
	    
	          }
	         }
	      }
	         return count;

	      }
	    }
