package BasicJavaPrograms;

public class PrintPrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
          int number = 654;
          
          int temp = number;
                   
          for(int i=2; i<number/2; i++) {
			
			if(temp%i==0) {
				
				if(isPrime(i)) {
				
				System.out.println(i + " ");
				
			//	temp = temp/i;
			}
				
				
			}
          }
		
		
	}
			
			public static boolean isPrime(int number) {
				
				if(number ==0 || number ==1) {
					
					return true;
					
				}
				
				for(int i=2; i<number/2; i++) {
					
					if(number%i==0) {
						
						return false;
					}
				}
				
				return true;
			}
			
		

	}


