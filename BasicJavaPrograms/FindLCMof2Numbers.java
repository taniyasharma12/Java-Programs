package BasicJavaPrograms;

public class FindLCMof2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 12; int number2 = 30;
		
		int onumber1 = 12; int onumber2 = 30;
		
		
		while(number1 %number2 !=0) {
			
			int rem = number1%number2;
			
			number1 = number2;

			number2 = rem;
			
		}
		
		int gcd = number2;
		
		System.out.println(gcd);
		
		int lcm = (onumber1*onumber2)/gcd;
		
		System.out.println(lcm);

	}

}
