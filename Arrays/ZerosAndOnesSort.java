package Arrays;

public class ZerosAndOnesSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Arr[] = { 0, 0, 1, 0, 1, 1, 0, 1, 0 };
		int temp =0;
		
		int n = Arr.length;
		
		for(int i=0; i<Arr.length; i++) {
			
			for(int j=i+1; j<Arr.length; j++) {
				
				if(Arr[i]>Arr[j]) {
					
					temp = Arr[i];
					Arr[i]= Arr[j];
					Arr[j]= temp;
				}
			}
		}
		for(int i=0; i<Arr.length; i++) {
			{
				System.out.print(Arr[i]);
			}
		}
		
	}
}
