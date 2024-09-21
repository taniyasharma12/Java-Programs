package PatternPrograms;

public class HollowRightTraingleStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n =7; 
		
		for(int i=0; i<=n; i++) {
			
			for(int j=0; j<=i; j++) {
				
			if(i==0 || i==n || j==0 ||j==i) {
				
				System.out.print("*");
					}
			else {
				System.out.print(" ");
	
			}

		}
			System.out.println();


	}

}
}
