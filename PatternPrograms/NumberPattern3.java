package PatternPrograms;

public class NumberPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*
12345
23456
34567
45678
56789
*/
		
		int rows =5;
		
		int cols =5;
		
		for(int i=1; i<rows; i++) {
			
			for(int j=i; j<i+cols; j++) {
				System.out.print(j);
			}
			
			System.out.println();
		}
	}

}
