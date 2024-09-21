package SearchAlgorithms;

public class BinarySearchUsingRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int target = 10;
		
		int arr[] = { 2, 3, 4, 10, 40 };
		
		int right = arr.length-1;
		
		int left = 0;
		
		int result = (searchHelper(left, right, target,arr));
		
		System.out.println(result);
	
	}
	
	public static int searchHelper(int left, int right, int target, int nums[]) {
		
		if(left>right) {
			return -1;
		}
		
		else {
			
			int mid = (left+right)/2;
			
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]>target) {
				return searchHelper(left, mid-1, target, nums);
			}
			else {
				return searchHelper(mid+1, right, target, nums);

			}
		}

}
}
