package PatternPrograms;

public class PyramidStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n =7;
		
		for(int i=0; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}	
			 for(int j=1; j<=i;j++) {
				  System.out.print("*");

			  }
			  System.out.println();
		  }
		  
		}
		
	}
	      