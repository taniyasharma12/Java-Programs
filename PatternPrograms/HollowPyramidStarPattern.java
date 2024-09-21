package PatternPrograms;

public class HollowPyramidStarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =7;
		
		for(int i=0; i<=n; i++) {
			for(int j=i; j<=n; j++) {
				
				System.out.print(" ");
			}
			
			for(int j=0; j<=i; j++) {
				
				if(i==0 || i==n ||j==0 || j == 2*i-1) {

				System.out.print("*");
				}
				else {
					
					System.out.print(" ");
			}	
			 for(j=1; j<=i;j++) {
				 
					if(i==0 || i==n ||j==0 || j == 2*i-1) {

				  System.out.print("*");
					}else {
						System.out.print(" ");

						
					}

			  }
			  System.out.println();
		  }
		}
		}
		
	}
	      