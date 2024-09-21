package PatternPrograms;

public class NumberTrianglePattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 
11111
2222
333
44
5
		 */
		
		int n =5;
		
		for(int i=1; i<=n; i++) {
			
			for(int j=i; j<=n; j++){
				System.out.print(i);
				
			}
			System.out.println();
		}
	}

}
