package miscellaneous;

public class RotateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr [] = {1,2,3};
		
		int k = 9;
		
		rotate(arr,k);
	}

	
	public static void rotate(int [] arr, int k) {
		
		int n = arr.length;
		
		k= k%n;

		reverse(0,n-1,arr);
		reverse(0,k-1,arr);
		reverse(k,n-1,arr);
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void reverse(int left, int right, int arr[]) {
		
		while(left<=right) {
			
			int temp = arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			
			left++;
			right--;
		}
	}
}
