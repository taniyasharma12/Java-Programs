package miscellaneous;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//https://leetcode.com/problems/merge-sorted-array/description/
		
		int nums1 []= {1,2,3,0,0,0};
		int m = 3;
		int [] nums2 = {2,5,6};
		int n = 3;
		
		merge(nums1,m,nums2,n);
	
	}

	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int i= m-1;
		
		int j=n-1;
		
		int k=m+n-1;
		
		while(j>=0 && i>=0) {
			if(nums2[j]>nums1[i]) {
				
				
			nums1[k]=nums2[j];
						k--;
						j--;
				
			}
			else {
				
				nums1[k]=nums1[i];
				k--;
				i--;
			}
		}
for(int x=0; x<nums1.length; x++) {
	
	System.out.println(nums1[x]);
}
	}
}
