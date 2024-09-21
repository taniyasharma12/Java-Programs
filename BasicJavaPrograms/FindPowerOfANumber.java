package BasicJavaPrograms;

public class FindPowerOfANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int exponent = 5 ;
		
		int base =2;
		
		int power = 1;
		
		
		for(int i=0; i<exponent; i++) {
			
			power = power * 2;
		}
		
		System.out.print(power);
	}

}
