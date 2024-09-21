package BasicJavaPrograms;

public class FactorialUsingRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(factorial(5));
		
	}
	
	public static int factorial(int number) {
		
		if(number==1) {
			return 1;
		}
		
		int fact = number;
		
		fact = fact * factorial(number-1);
		
		return fact;
	}
		
	}


