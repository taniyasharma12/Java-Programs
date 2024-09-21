package Arrays;

public class FindSumOfArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[] = {1,3,45,34,45};
		System.out.println(sum(arr));
	}

public static int sum(int arr[]) {
        
        int sum =0;
        
        for(int i=0; i<arr.length; i++){
            
            sum = sum + arr[i];
        }
        
            return sum;

    }
    
}