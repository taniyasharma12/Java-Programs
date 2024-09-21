package Arrays;

import java.util.Arrays;

public class SuffixPostfixSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 15, 10, 25, 5, 10, 20 };
		
		//output suffixSum[] = { 85, 70, 60, 35, 30, 20}
		
		System.out.println(suffixSum(arr));
	}

	public static String suffixSum(int arr[]) {
		
		int suffixSum [] = new int[arr.length];		
		
		
		suffixSum[arr.length-1] = arr[arr.length-1];
		
		for(int i=arr.length-2; i>=0; i--) {
			
			suffixSum[i] = suffixSum[i + 1] + arr[i];
			
		}
		
		return Arrays.toString(suffixSum);

	}
}
