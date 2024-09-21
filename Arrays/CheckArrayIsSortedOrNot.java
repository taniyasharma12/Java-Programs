package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckArrayIsSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {1,1,2,3,4,4};
		
		System.out.println(isSorted(arr));
		
	}
	
	
	public static boolean isSorted(int arr[]) {
		
		
		for(int i=0 ; i<arr.length-1; i++){
			
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		
		return true;
	}
	
}