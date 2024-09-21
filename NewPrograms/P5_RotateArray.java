package NewPrograms;

public class P5_RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// input length of array n , Arr Array values, and k integer by which we need to rotate

		int[] Arr = { 1, 2, 3, 4, 5, 6 };

		int n = 6;
		int k = 3;
		rotate(Arr,n,k);
		for(int i=0; i<Arr.length; i++) {
	System.out.print(Arr[i]);
		}
	}
	
	public static void reverse(int Arr[], int start, int end) {
		
		while(start<=end) {
			int temp=0;
			
			temp = Arr[start];
			Arr[start]= Arr[end];
			Arr[end]=temp;
			
			start++;
			end--;
		}
			}
	
	public static int[] rotate(int Arr[], int n, int k) {
		k = k%n;
		reverse(Arr, 0, n-1);
		reverse(Arr,0,k-1);
		reverse(Arr, k, n-1);
		return Arr;
	}
}