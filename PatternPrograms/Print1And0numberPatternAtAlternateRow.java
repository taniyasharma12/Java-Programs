package PatternPrograms;

public class Print1And0numberPatternAtAlternateRow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r=6;
		
		int c=4;
		
		for(int i=0; i<r; i++) {
			
			for(int j=0; j<c; j++) {
				
				if(i%2==0) {
					
					System.out.print("1");
				}
				else
				{
					System.out.print("0");
		
				}
			}
			System.out.println();
		}
	}

}
