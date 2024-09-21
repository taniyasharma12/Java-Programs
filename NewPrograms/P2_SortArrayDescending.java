package NewPrograms;

public class P2_SortArrayDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Arr[] = {0,5,7, 9,2,4,3,7};
		
		int temp =0;
		
		for(int i=0; i<Arr.length; i++) {
			for(int j=i+1; j<Arr.length; j++) {
				
				if(Arr[i]<Arr[j]) {
					
					temp= Arr[i];
					Arr[i]=Arr[j];
					Arr[j]= temp;
					
				}
			}
		}
		for(int i=0; i<Arr.length; i++) {
			System.out.print(Arr[i]);
		}
		
	}

}
