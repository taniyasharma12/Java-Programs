package PatternPrograms;

public class RhombusStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		
		for(int i=0; i<=n; i++)
	    {
	        /* Print leading spaces */
	        for(int j=i; j<=n; j++)
	        {
	        	
	        	System.out.print(" ");
	        }

		for( int j=0; j<=n; j++)
        {
	        System.out.print("*");
	}
		System.out.println();

}

	}
}