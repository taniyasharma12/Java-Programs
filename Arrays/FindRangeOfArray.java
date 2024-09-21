package Arrays;

import java.util.Scanner;

public class FindRangeOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//range -> max- min
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = sc.nextInt();
			
		}
		
		int max = Integer.MIN_VALUE;
		
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>max) {
				max = arr[i];
			}
			
			if(arr[i]<min) {
				
				min = arr[i];
			}
		}
		
		System.out.println("max number is " + max + " minimum number is "+ min + " range is "  +(max-min));
	}
}