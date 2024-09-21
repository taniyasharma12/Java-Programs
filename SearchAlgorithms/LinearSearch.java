package SearchAlgorithms;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {1,2,3,4,7,8,934,54,56,78};
		
		int target = 54;
		
		System.out.println(linearSearch(arr,target));
		
	
	}
	
	public static int linearSearch(int arr[], int target) {
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==target) 
				
				return i;
			
		}
		return -1;
		}

}


