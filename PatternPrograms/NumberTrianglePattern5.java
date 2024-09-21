package PatternPrograms;

public class NumberTrianglePattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
1
21
321
4321
54321 
		 */
		
		int n=5;
		
		for(int i=0; i<=n; i++) {
			for(int j=i; j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
