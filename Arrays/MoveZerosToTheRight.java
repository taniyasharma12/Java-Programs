package Arrays;

public class MoveZerosToTheRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {0,1,0,3,12};
		
		moveZeroes(arr);
	}

	public static void moveZeroes(int[] nums) {

		int j = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {

				nums[j] = nums[i];

				j++;

			}
		}
		for (int k = j; k < nums.length; k++) {

			nums[k] = 0;
		}

		for (int k = 0; k < nums.length; k++) {
			System.out.print(nums[k] + ",");
		}
	}
}
