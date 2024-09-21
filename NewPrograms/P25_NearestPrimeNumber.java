package NewPrograms;

public class P25_NearestPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int number = 24;
		nearestPrime(number);
		
		
	}
		
		public static boolean isPrime(int number) {
			
			if(number<=1) {
				return false;
			}
			for(int i=2; i<number/2; i++) {
				if(number%i==0) {
					return false;
				}
			}
			return true;
		
	}
		
		public static void nearestPrime(int number) {
			
			int lower = number-1;
			int upper = number+1;
			while(number>0) {
			if(isPrime(number)) {
			System.out.println(number);
			break;
		}
			else if(isPrime(lower)) {
				System.out.println(lower);
				break;
			}
			else if(isPrime(upper)) {
				System.out.println(upper);
				break;
			}

			lower--; 
			upper++;
		
}
}
}
