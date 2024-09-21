package PatternPrograms;

public class NumberTrianglePattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *
1
10
101
1010
10101 
		 */
		
		int n=5;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				
				if(j%2==0) {
					System.out.print(1);
				}
				else {
					System.out.print(0);
			
				}
			}
			System.out.println();
		}
	}

}
