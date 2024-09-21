package NewPrograms;

public class P4_ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Arr[] = { 2, 4, 5, 6, 7, 8, 9 };

		int n = Arr.length;

		int start = 0;

		int end = n - 1;
		
		int temp = 0;

		while (start <= end) {
          temp = Arr[start];
          Arr[start]=Arr[end];
          Arr[end]=temp;
          
          start++;
          end--;
			
		}

		for (int i=0; i<n; i++) {
			System.out.print(Arr[i]);
		}
	}

}
