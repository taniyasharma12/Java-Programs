package BasicJavaPrograms;

public class UglyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.
		
		int n = 21;
		System.out.println(isUgly(54));
		
	}
		public static boolean isUgly(int n) {
		if(n<=0) 
			
		return false;
        while(n%2==0) {
			n /= 2;
		}
		while(n%3==0) {
			n /= 3;
		}
		while(n%5==0) {
			n /= 5;
		}
		
		return (n==1);
		
		
		
	}

}
