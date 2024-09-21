package Arrays;

public class ConcatenationofArrayLeetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://leetcode.com/problems/concatenation-of-array/
		
		int nums [] = {1,2,1};
		
	
		
	}
public static int[] getConcatenation(int[] nums) {
        
        //create array of size 2n, iterate over array and add elements
        int n = 2*nums.length;
        int [] result = new int[n];

        for(int i=0; i<nums.length; i++){

            result[i]=nums[i];
            result[i+nums.length]=nums[i];

        }
        return result;
    }
}