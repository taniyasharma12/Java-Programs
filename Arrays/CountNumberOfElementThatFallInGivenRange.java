package Arrays;

public class CountNumberOfElementThatFallInGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int [] arr = {1, 3, 5, 2};
		int r1 = 1;
		int r2 = 5;
		//Output:4
		
		System.out.println(range(arr,1,5));		
	}

	
	public static int range(int [] arr, int r1, int r2) {
		
		int count =0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]<=r2 && arr[i]>=r1) {
				
				count++;
			}
		}
		
		return count;

	}
}
