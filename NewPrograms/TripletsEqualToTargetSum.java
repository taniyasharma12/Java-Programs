package NewPrograms;

public class TripletsEqualToTargetSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] Arr = {2,3,1,2,2};
		
		int sum = 6;
		
		int n= Arr.length;
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int k=j+1; k<n; k++) {
					if(Arr[i]+Arr[j]+Arr[k]==sum) {
						System.out.println(Arr[i]+" "+Arr[j]+" "+Arr[k]);
					}
					
				}
			}
		}
	}
}
		
		
