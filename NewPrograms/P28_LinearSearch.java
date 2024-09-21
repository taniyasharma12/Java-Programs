package NewPrograms;

public class P28_LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num[] = {1,2,3,4,5,6,7};
		
		int target = 7;
		
		if(linearSearch(num, target)==-1) {
			System.out.println("not present");
		}
		else {
		System.out.println(linearSearch(num, target));
	}
	}
		
		
		public static int linearSearch(int arr[], int target) {
			
			for(int i=0; i<arr.length; i++) {
				
				if(arr[i]==target) {
					return i;
				}
			}
			return -1;
		}
}
