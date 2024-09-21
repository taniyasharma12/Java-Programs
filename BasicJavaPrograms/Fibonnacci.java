package BasicJavaPrograms;

public class Fibonnacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//0, 1, 1, 2, 3, 5, 8, 13, 21, 34
		
		int first =0;
		
		int second =1;
		
		int third;
		
		int n =35;
		
		for(int i=0; i<n; i++) {
			
			third = first +second;
			System.out.print(third + " ");

			first = second;
			second = third;
			
	}

}
}
