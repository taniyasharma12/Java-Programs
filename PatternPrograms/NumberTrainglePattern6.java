package PatternPrograms;

public class NumberTrainglePattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
9
79
579
3579
13579
		 */
		int n=5;
		
		
		for(int i=n; i>=1; i--) {
			
			int k= (i*2)-1;
			
			for(int j=i; j<=n; j++) {
				System.out.print(k);
				k= k+2;
			}
			
			System.out.println();
		}
	}

}
