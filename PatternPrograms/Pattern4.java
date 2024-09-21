package PatternPrograms;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		   ssss*
		   sss**
		   ss***
		   s****
		   *****
		 
		 */
		int n=5;
		
		for(int i=1; i<=n; i++) {
		
			for(int j=i; j<=n-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();

		}

		
	}

}
