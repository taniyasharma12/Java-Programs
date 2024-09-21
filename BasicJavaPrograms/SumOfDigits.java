package BasicJavaPrograms;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		
	    int N = 18;
	    
	    int temp =N;
		
		while(temp>0) {
		
			int rem = temp%10;
			
			temp = temp/10;
			
			sum = sum + rem;	
			
		}

		System.out.println(sum);
	}
	
}
