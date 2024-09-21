package Arrays;

import java.util.Scanner;

public class FindSmallestAndSecondSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		int ans[] = new int[2];
		
		for(int i=0; i<n; i++) {
			
			arr[i] = sc.nextInt();
		}
		
		ans = minAnd2ndMin(arr,n);
		
		
		for(int i=0; i<2; i++) {
			System.out.println(ans[i]);

		}
		
	}
		public static int[] minAnd2ndMin(int arr[], long n) {
			int min = Integer.MAX_VALUE;
			int secondSmallest = Integer.MAX_VALUE;
			
			int ans [] = new int[2];
			
		for(int x : arr) {
			
			if(x<min) {
				secondSmallest = min;
				min =x;
				
			}
			else if(x!=secondSmallest && x<secondSmallest)
			{
				secondSmallest =x;
			}
		}
		if(secondSmallest== Integer.MAX_VALUE) {
			ans[0]= -1;
			ans[1]= -1;
			return  ans;
		}
		else 
			ans[0]= min;
		ans[1]= secondSmallest;
			return  ans;
		}
}