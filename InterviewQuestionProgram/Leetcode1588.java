package InterviewQuestionProgram;

import java.util.ArrayList;

/**
 * @author TaniyaSharma
 *
 */
public class Leetcode1588 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr [] = {1,4,2,5,3};
		            //0,1,2,3,4 
		             //1,5,7,12,15 
		System.out.println(sumOddLengthSubarrays(arr));
		
	}

	
	public static int sumOddLengthSubarrays(int arr[]) {
		
		
		int prefix [] = new int[arr.length];
		
		prefix[0]=arr[0];
		
		int sum=0;
		
        ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=1; i<arr.length; i++) {
			
			prefix[i] = prefix[i-1]+arr[i];
			
		} //0,0|0,2|0,4|1,1|1,3|2,2| 2,4 | 3, 3|4,4
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i; j<arr.length; j+=2) {
				//i+1 for odd
				System.out.println(i+" "+j);
				
				if(i==0) {
					
             list.add(prefix[j]);		
             
				}
				else {
					
					list.add(prefix[j]-prefix[i-1]);
				}
			}
		}
		for(int i=0; i<list.size(); i++) {
			
			sum+=list.get(i);
		}
		return sum;
	}
	
}

