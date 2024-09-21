package PatternPrograms;

public class NumberTrianglePattern3 {

	
	/*
55555
4444
333
22
1
	 */
	
	public static void main (String args[]) {
		
		int n =5;
		
		for(int i=n; i>0; i--) {
			
			for(int j=i; j>0; j--) {
				
				System.out.print(i);
			}
			
			System.out.println();
		}
		
	}
}
