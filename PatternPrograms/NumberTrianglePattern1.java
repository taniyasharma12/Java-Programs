package PatternPrograms;

public class NumberTrianglePattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
		1
		22
		333
		4444
		55555
		
		*/
		
	    int n=5;
	    
	    for(int i=0; i<=n; i++) {
		    for(int j=0; j<i; j++) {
 	         System.out.print(i);
	    }
		    System.out.println();
	}
	}
}