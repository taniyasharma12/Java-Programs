package Arrays;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums1 = {1,2,3};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        
        int[] arr = new int[m+n];
        
        
        for(int i=0; i<m; i++) {
        	
        	arr[i] =nums1[i];
        }

       for(int i=0; i<n; i++) {
        	
        	arr[m+i] =nums2[i];
        }
        
       Arrays.sort(arr);
       
        for(int i=0; i<arr.length; i++) {
        	
        	System.out.println(arr[i]);
        }

        
	}

}
