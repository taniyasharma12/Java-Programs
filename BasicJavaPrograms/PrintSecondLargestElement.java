package BasicJavaPrograms;

public class PrintSecondLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Arr[] = {20, 75, 30};
		
		int temp = 0;
		
		for(int i =0; i<Arr.length; i++) {
			
			for(int j=i+1; j<Arr.length; j++) {
				
				if(Arr[i]>Arr[j]) {
					
					temp = Arr[i];
					Arr[i]=Arr[j];
					Arr[j]=temp;
				}
			}
		}
		
		//for(int k = 0; k<Arr.length; k++)
		System.out.println(Arr[Arr.length-2]);

	}

}
