package Arrays;

public class MergeSortedArrayWithoutExtraArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//https://leetcode.com/problems/merge-sorted-array/
	}

	
public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m-1;

        int j=  n-1;

        int k= m+n-1;

        while(j>=0){

               if(i>=0 && nums1[i]>nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
               }

               else{
                nums1[k] = nums2[j];
                k--;
                j--;
               }


        }
    }
}
