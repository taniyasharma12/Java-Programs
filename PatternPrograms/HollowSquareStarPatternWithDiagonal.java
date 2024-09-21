package PatternPrograms;

public class HollowSquareStarPatternWithDiagonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n =5;
		
		for(int i=0; i<=n; i++) {
			for(int j=0; j<=n; j++) {
			if(i==0 || i==n || j==0 || j==n || i==j) {
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

