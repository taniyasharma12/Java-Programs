package PatternPrograms;

public class InvertedPyramidStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n=6;
		
		for(int i=0; i<=n; i++) {
			
			for(int j=0; j<i; j++) {
				
				System.out.print(" ");
			}
			
			for(int j=i; j<=n; j++) {
				System.out.print("*");
		
			}
			
			for(int j=i; j<n; j++) {
				System.out.print("*");
	
			}
			System.out.println();

		}
	}

}
