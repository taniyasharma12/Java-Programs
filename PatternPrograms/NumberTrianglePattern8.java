package PatternPrograms;

public class NumberTrianglePattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
1
01
010
1010
10101
		 */
		
		int n=5;
		
		int k=1;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<=i; j++) {
				 if (k % 2 == 1) {
				System.out.print("1");
				 }
				 else {
						System.out.print("0");
		 
				 }
				 k++;
			}
			System.out.println();
		}
	}

}
